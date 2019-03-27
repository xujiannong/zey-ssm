define(function(require, exports, module){

    var internal = {
        init:function(){
            internal.user();
            //$("#userMassage").html("</tr>")
        },

        user:function () {
            var temp;
            var htmlArray = new Array()
            $.ajax({
                type:'post',
                url:webRoot+'user/getUser',
                dataType:"json",
                success:function (data) {
                    for(var i=0;i<data.length;i++){
                        temp+="<tr>";
                        // temp+="<th>"+data[i].id+"</th>";
                        temp+="<th>"+data[i].username+"</th>";
                        // temp+="<th>"+data[i].password+"</th>";
                        temp+="<th>"+data[i].email+"</th>";
                        temp+="<th>"+data[i].phone+"</th>";
                        temp+="<th>"+data[i].rolename+"</th>";
                        temp+="<th><a href='"+webRoot+"user/edit?id="+ data[i].id +"'>Edit</a></th>";
                        temp+="<th><a href='"+webRoot+"user/delete?id="+ data[i].id +"'>Delete</a></th>";
                        temp+="</tr>";
                        // $(temp).find("#userMassage tr").html("<th>"+data[i].id+"</th>"),
                        // $(temp).find("#userMassage tr").html("<th>"+data[i].username+"</th>"),
                        // $(temp).find("#userMassage tr").html("<th>"+data[i].password+"</th>"),
                        // $(temp).find("#userMassage tr").html("<th>"+data[i].email+"</th>"),
                        // $(temp).find("#userMassage tr").html("<th>"+data[i].phone+"</th>"),
                        // $(temp).find("#userMassage tr").html("<th>"+data[i].rolename+"</th>"),
                        // htmlArray.push(temp)
                    };
                    $("#userMassage").html(temp);
                }
            });
            $("#userMassage").html("aaa");
        },
    };
    exports.init = function () {
        //init event
        internal.init();
    };
});