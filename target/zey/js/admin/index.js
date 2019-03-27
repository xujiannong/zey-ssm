define(function(require, exports, module){

    var internal = {
        init:function(){
            $("#login").attr("action",webRoot+"user/login")
            internal.login();
            //$("#userMassage").html("</tr>")
        },


        login:function () {
            $("#login").submit(function () {
                $("#login").attr("action",webRoot+"user/login")

            });
        },
    };
    exports.init = function () {
        internal.init();
    };
});