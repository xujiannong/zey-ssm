define(function(require, exports, module){
    var internal = {
        init:function(){
            //internal.event();
            internal.test();

        },

        buildList: function () {
            $("#system-list" ).empty();
            var req = new Request("home/getSystemList");
            req.get({
                isTip: false,
                success: function (data) {
                    if (data.isSuccess) {

                        var defImageUrl = webRoot + "assets/dist/images/listPicture/icon_new/sub_icon_01.png";
                        $.each(data.result, function (index, item) {
                            var jqSpan =  $('<span></span>').addClass("type-title" ).text(item.name);
                            var jqBoxDiv =   $("<div></div>").addClass("sys-box" );
                            $.each(item.ssoSystemInfoList, function(sso_index, sso_item){
                                var jqItemDiv =   $("<div></div>").addClass("sys-item" );
                                var url = webRoot + "sso/client/redirect?client_id=" + sso_item["key"] + "&redirect_uri=" + sso_item["redirectUrl"];
                                var imageUrl = webRoot + sso_item.imageSrc;
                                var jqSysOuter = $('<a></a>').attr({
                                    href: url,
                                    target: "_blank",
                                    title: sso_item["name"]
                                });
                                var jqSysItemFlow = $("<div></div>").addClass("sys-item-flow");
                                var jqInner = $("<div></div>").addClass("inner");
                                var jqImage = $("<img/>").addClass("icon").attr({src: imageUrl}).on("error", function(){
                                    $(this).attr("src", defImageUrl);
                                });
                                var jqSysSpan = $("<span></span>").text(sso_item["name"]);
                                jqInner.append(jqImage).append(jqSysSpan);
                                jqSysItemFlow.append(jqInner);
                                jqSysOuter.append(jqSysItemFlow);
                                jqItemDiv.append(jqSysOuter);
                                jqBoxDiv.append(jqItemDiv);

                                //宽度和高度使用定值，不能使用全局变量，不然鼠标频繁切换时，会出现bug
                                jqSysItemFlow.hover(function(){
                                    var big = 1.2;//放大倍数
                                    var bigWid = 174 * big;
                                    var bigHei = 121 * big;
                                    $(this).animate({
                                        "width": bigWid,
                                        "height": bigHei,
                                        "z-index":100,
                                        "margin-left":-10,
                                        "margin-top": -10
                                    });
                                },function(){
                                    $(this ).stop().animate({
                                        "width": 174,
                                        "height":121,
                                        "margin-left":0,
                                        "margin-top":0,
                                        "z-index":1
                                    });
                                });
                            });

                            $("#system-list").append(jqSpan);
                            $("#system-list").append(jqBoxDiv);
                        });
                    }
                }
            });
        }

    };
    exports.init = function () {
        //init event
        internal.init();
    };
});