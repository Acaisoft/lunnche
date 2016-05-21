module.exports = function (grunt) {

    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        compass: {
            dist: {
                options: {
                    sassDir: 'src/assets/scss',
                    cssDir: 'src/assets/css',
                    outputStyle: 'compressed'
                }
            }
        },
        watch: {
            css: {
                files: ['src/assets/scss/*.scss'],
                tasks: ['compass']
            }
        },
        connect: {
            server: {
                options: {
                    port: 9000,
                    hostname: 'localhost',
                    keepalive: true,
                    base: {
                        path: '.',
                        options: {
                            index: 'index.html'
                        }
                    },
                    middleware: function (connect, options, defaultMiddleware) {
                        var proxy = require('grunt-connect-proxy/lib/utils').proxyRequest;
                        return [
                            // Include the proxy first
                            proxy
                        ].concat(defaultMiddleware);
                    }
                },
                proxies: [
                    {
                        context: '/api',
                        host: 'localhost',
                        port: 8090,
                        https: false
                    }
                ]
            }
        }
    });
    grunt.loadNpmTasks('grunt-contrib-compass');
    grunt.loadNpmTasks('grunt-contrib-watch');
    grunt.loadNpmTasks('grunt-contrib-connect');
    grunt.loadNpmTasks('grunt-connect-proxy');

    grunt.registerTask('default', [
        'configureProxies:server',
        'connect:server',
        'watch'
    ]);
};
