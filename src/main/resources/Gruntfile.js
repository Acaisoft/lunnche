module.exports = function(grunt) {
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
    }
  });
  grunt.loadNpmTasks('grunt-contrib-compass');
  grunt.loadNpmTasks('grunt-contrib-watch');

  grunt.registerTask('default', ['watch']);
};
