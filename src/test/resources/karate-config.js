function f() {
    var config = {};
    config.env = karate.env;
    karate.log('environment supplied is ' + config.env);
    return config;
}