define(function(require, exports, module){

    var internal = {
        init:function(){
            $("#top_menu").load(webRoot +"share/topMenu");
            internal.click();
        },
    click:function(){
        $( "#loginBtn" ).click(function() {
            self.location=webRoot+"register/index"
        });
        $( "#aa" ).click(function() {
            self.location=webRoot+"register/index"
        });
        $("li").each(function(index){
            $(this).click(function(){
                $("li").removeClass("active");
                $("li").eq(index).addClass("active");
            });
        });
    }
};
    exports.init = function () {
        //init event
        internal.init();
    };
});