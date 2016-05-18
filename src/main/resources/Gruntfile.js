module.exports = function(grunt) {
  grunt.initConfig({
    pkg: grunt.file.readJSON('package.json'),
    compass: {
      dist: {
        options: {
          sassDir: 'assets/scss',
          cssDir: 'assets/css',
          outputStyle: 'compressed'
        }
      }
    },
    watch: {
      css: {
        files: ['assets/scss/*.scss'],
        tasks: ['compass']
      }
    }
  });
  grunt.loadNpmTasks('grunt-contrib-compass');
  grunt.loadNpmTasks('grunt-contrib-watch');

  grunt.registerTask('default', ['watch']);
};
