$().ready(function () {

    // 注册窗口打开关闭
    $("#main-btn").click(function () {
        $("#main-reg").show(500);
    });
    $(".reg-can,#main-reg-close").click(function () {
        $("#main-reg").hide(500);
    });

    // 新增工作经历窗口打开关闭
    $(".work-history-add").click(function () {
        $("#main-reg").toggleClass('noclick');
        $("#others").show(100);
        $("#add-work").show(200);
    })

    $(".work-can").click(function () {
        $("#main-reg").toggleClass("noclick");
        $("#others").hide(200);
        $("#add-work").hide(100);
    });



    // 新增项目经验窗口打开关闭
    $(".project-history-add").click(function () {
        $("#main-reg").addClass('noclick');
        $("#others").show(100);
        $("#add-pro").show(200);
    });
    $(".pro-can").click(function () {
        $("#main-reg").toggleClass("noclick");
        $("#others").hide(200);
        $("#add-pro").hide(100);
    });

    // 新增证书打开关闭
    $(".diploma-add").click(function () {
        $("#main-reg").addClass('noclick');
        $("#others").show(100);
        $("#add-zs").show(200);
    });
    $(".zs-can").click(function () {
        $("#main-reg").toggleClass("noclick");
        $("#others").hide(200);
        $("#add-zs").hide(100);
    });

    // input点击出现日历
    $(".yi-datepicker").datetimepicker({
        format: 'yyyy-mm-dd',
        minView : "day",
        timepicker:false,
        autoclose : true, //  true:选择时间后窗口自动关闭   
    });
})