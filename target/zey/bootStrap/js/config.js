seajs.config({
    //根路径
    base: seajsRoot,
    // 变量配置
    vars: {
        'dir': seajsRoot + 'js'
    },
    // 路径配置
    paths: {
        'modules': '{dir}'
    },
    // 调试模式，测试环境开启
    debug: false,
    // 文件编码
    charset: 'utf-8',
    //版本管理
    //map: [[/^(.*\.(?:css|js))(.*)$/i, '$1?version=' + version]]  //map,批量更新时间戳
});