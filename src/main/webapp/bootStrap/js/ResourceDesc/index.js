/*
 * adder : leaf.fly(hd);
 * create : 2017-12-18
 * desc : this is js for home/index
 * github : http://github.com/sherlock-help
 * */
;"use strict";
;define(function(require, exports, module){

    var internal = {
        init:function(){
            alert("测试");
            internal.getSickRate();
        },
        getSickRate:function(){
            $.ajax({
                url:"",
                data: [{type:"",obj:""}],
                success:function(data){

                }
            });
            $("#sick_rate").html("%25");
        }

    };
    exports.init = function () {
        //init event
        internal.init();
    };
});