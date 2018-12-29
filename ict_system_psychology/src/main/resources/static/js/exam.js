
$('.exam-feature>li').eq(0).click(function(){
	test2();
	$('.technology').hide();
	$('.psychological').show();
})
$('.exam-feature>li').eq(1).click(function(){
	test2();
	$('.psychological').hide();
	$('.technology').show();
})

function test2(){
	$('.exam-con').hide();
	$('.exam-explain').show();

}


// 答题页面
// 生成答题卡



var number = "3";

//获取题目方法
function gain_data(number){
	var data1;
	$.ajax({
		url : "/eaxm/psychology-selectAll",
		// 数据发送方式
		type : "post",
		//传递的数据
		data : {
			"number" : number 
		},
		// 接受数据格式
		dataType : "json",
		//设置同步调用
		async : false,
		success : function(data) {
			data1 = data;
		}
	});
	return data1;
}

//显示试题
function select(a) {
	//答案显示
	$('.exam-question label').eq(0).html(result[a].num1);
	$('.exam-question label').eq(1).html(result[a].title);
	$('.exam-question label').eq(2).html(result[a].answer1);
	$('.exam-question label').eq(3).html(result[a].answer2);
	$('.exam-question label').eq(4).html(result[a].answer3);
	$('.exam-question label').eq(5).html(result[a].answer4);
	
	//input输入框值显示
	$('.exam-question input').eq(0).css("value",result[a].num1);
	$('.exam-question input').eq(1).css("value",result[a].num1);
	$('.exam-question input').eq(2).css("value",result[a].num1);
	$('.exam-question input').eq(3).css("value",result[a].num1);

	
}
//得到数据库中的试题
var result = gain_data(number);
console.log(result)
console.log(result[0].num1)


//显示试题
select(0)
//题目和题号一致
same(0)


for (var i = 1;i<=result.length;i++) {
 	let tag = `<li>${i}</li>`;
 	$('.dart ol').append(tag);
 } 

// 倒计时

// 设置据当前时间开始，考试的结束时间
  var endtime = new Date(), endseconds = endtime.getTime() + 60 *60* 1000;
  var h = m = s = 0;
  var id = setInterval(seckill, 1000);
  function seckill() {
    var nowtime = new Date();    // 获取当前时间
    var remaining = parseInt((endseconds - nowtime.getTime()) / 1000);
    if (remaining > 0) {
      h = parseInt((remaining / 3600) % 24);  
      m = parseInt((remaining / 60) % 60);   
      s = parseInt(remaining % 60);          
      // 统一利用两位数表示剩余的小时、分钟、秒
      h = h < 10 ? '0' + h : h;
      m = m < 10 ? '0' + m : m;
      s = s < 10 ? '0' + s : s;
    } else {
      clearInterval(id);     
       h = m = s = '00';
    }
   	let time = `${h}:${m}：${s}`
   	$('.exam-time>span').html(time)
  }
// 答题卡
  $('.scantron-icon').click(function(){
  	$(this).toggle();
  	$(this).siblings('.scantron-icon').toggle();
  	$(this).parent('p').siblings('.scantron-num').toggle();
  })

$('.scantron li').click(function(){
	$('.scantron li').removeClass('current');
	$(this).addClass('current');
	
})
$('.dart li').click(function(event) {
	let num = $(this).html()-1;
	select(num)
});
// 上一题
$('.exam-question .pre').click(function(event) {
	let num = $('.exam-question label').eq(0).html();
	if (num==0) {
		alert('这已经是第一题了！');
		same(num)

	}else{
		num--
		select(num)
		same(num)
	}
});
console.log($('.exam-question label').eq(1).html())
// 下一题
$('.exam-question .next').click(function(event) {
	let num = $('.exam-question label').eq(0).html();
	let index = result.length-1;
	if (num==index) {
		same(num)
		alert('这已经是最后一题了！');
	}else{
		num++
		select(num)
		same(num)
	}
	
	$('input').removeAttr("checked");
});



// 题号一致
function same(a){
	$('.scantron li').removeClass('current');
	$('.scantron li').eq(a).addClass('current');
}



//选中的答案
$('input').change(function() {
	alert($(this).find(':after :latel').html());
	
});
