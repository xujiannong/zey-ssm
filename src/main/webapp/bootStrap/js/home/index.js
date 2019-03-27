define(function(require, exports, module){

    var internal = {
        init:function(){
            //internal.event();
            internal.test();

        },
        test: function () {
            //$("#top_menu").attr("src",webRoot+"shop/top");
          $("form").submit(function(e){
              internal.login();
          });
        },
        event:function () {
            //绑定登录事件
            $("#login-btn").click(function () {
                internal.login();
            });
            //输入框事件
            $("#name-login").keyup(function (e) {
                if (e.keyCode == 13) {
                    $("#login-btn").click();
                }
            });
            $("#password-login").keyup(function (e) {
                if (e.keyCode == 13) {
                    $("#login-btn").click();
                }
            });
        },
        login:function () {
            var param = {
                username: $("#name-login").val(),
                password: $("#password-login").val(),
            };
            $.ajax({
                type:'post',
                url:webRoot + 'register/login',
                dataType:"json",
                async: true,
                data:param,
                success:function(data){
                    if(data=="" || data == null){
                        alert("没有这个用户！")
                    }else if(data[0].password != $("#password-login").val()){
                        alert("密码错误！")
                    } else{
                        self.location =webRoot+"shop/index";
                    }
                }
            });
        },
    };
    exports.init = function () {
        //init event
        internal.init();
    };
});