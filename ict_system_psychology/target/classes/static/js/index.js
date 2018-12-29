

// 注册登录切换
$('.reg-text').click(function(){
	$('.login-right').toggle();
	$('.register-right').toggle();
})

// 非空判断
$('.non-null').blur(function(){
	let a = this;
	if ($(this).val()=='') {
		wrongful(a);
	}else{
		lawful(a);
	}
})

// 验证手机号码
$('.phone-num').keyup(function(){
	let a = this;
	if ($(this).val().match(/^1(3|4|5|7|8)\d{9}$/)) {
		lawful(a);
	}else{
		wrongful(a);
	}
})
// 验证合法的
function lawful(a){
	$(a).css('border-color', '#46be8a');
	$(a).siblings('.ok-sign').show();
	$(a).siblings('.remove').hide();
}
// 验证不合法的
function wrongful(b){
	$(b).css('border-color', 'red');
	$(b).siblings('.remove').show();
	$(b).siblings('.ok-sign').hide();
}

// 注册--阻止默认行为
function prevent(){
	var flag=true;	
	if($('.register-form .non-null').val()==''){
		flag=false;
		wrongful('.register-form .non-null')
	}
	if($('.register-form .phone-num').val().match(/^1(3|4|5|7|8)\d{9}$/)){			
	}else{
		flag=false;
		wrongful('.register-form .phone-num');
	}
	return flag;	
};


// 登录

	$(function () {
	  $('[data-toggle="tooltip"]').tooltip()
	})			
	$('.btn-default').click(function(){
		$('.login-register').toggle();
		if ($(window).width()>768) {
			$('.right').toggle();
		}
		if ($(window).width()<768) {
			$('.home-top').toggle();
		}
	})	

// 检测窗口的缩放
$(window).resize(function(){
	if ($(window).width()>768) {
		$('.personal-info-mobile').hide();
		$('.personal-info-web').show();

	}else{
		$('.personal-info-mobile').show();
		$('.personal-info-web').hide();
	}
})

// 考试系统模块交互

$('.exam-show>li>div').hover(function(){
	$(this).children('.exam-icon').toggleClass('exam-icon1');
})


// 监听窗口滚动
$(window).scroll(function(event) {

	let scroll = $(window).scrollTop();
	if (scroll>1900) {
		$('.client').addClass('fadeInUp');
	}else if (scroll>1400) {
		$('.hrm').addClass('fadeInUp');
	}else if (scroll>800) {
		$('.exam-module-bg').addClass('fadeInUp');
		
	}else if (scroll>100) {
		$('.project-show-bg').addClass('fadeInUp');
	}
	
});

//窗口显示才加载
	var wrapTop = $(".hrm-show").offset().top;
	var istrue = true;
	$(window).on("scroll",
		function() {
		    var s = $(window).scrollTop();
		    if (s > wrapTop - 500 && istrue) {
		        $(".timer").each(count);
		        function count(a) {
		            var b = $(this);
		            a = $.extend({},
		            a || {},
		            b.data("countToOptions") || {});
		            b.countTo(a)
		        };
		        istrue = false;
		    };
		})
	//设置计数
	$.fn.countTo = function (options) {
		options = options || {};
		return $(this).each(function () {
			//当前元素的选项
			var settings = $.extend({}, $.fn.countTo.defaults, {
				from:            $(this).data('from'),
				to:              $(this).data('to'),
				speed:           $(this).data('speed'),
				refreshInterval: $(this).data('refresh-interval'),
				decimals:        $(this).data('decimals')
			}, options);
			//更新值
			var loops = Math.ceil(settings.speed / settings.refreshInterval),
			    increment = (settings.to - settings.from) / loops;
			//更改应用和变量
			var self = this,
			$self = $(this),
			loopCount = 0,
			value = settings.from,
			data = $self.data('countTo') || {};
			$self.data('countTo', data);
			//如果有间断，找到并清除
			if (data.interval) {
				clearInterval(data.interval);
			};
			data.interval = setInterval(updateTimer, settings.refreshInterval);
			//初始化起始值
			render(value);
			function updateTimer() {
				value += increment;
				loopCount++;
				render(value);
				if (typeof(settings.onUpdate) == 'function') {
					settings.onUpdate.call(self, value);
				}
				if (loopCount >= loops) {
					//移出间隔
					$self.removeData('countTo');
					clearInterval(data.interval);
					value = settings.to;
					if (typeof(settings.onComplete) == 'function') {
						settings.onComplete.call(self, value);
					}
				}
			}
			function render(value) {
				var formattedValue = settings.formatter.call(self, value, settings);
				$self.html(formattedValue);
			}
			});
        };
        $.fn.countTo.defaults={
        	from:0,               //数字开始的值
        	to:0,                 //数字结束的值
        	speed:1000,           //设置步长的时间
        	refreshInterval:100,  //隔间值
        	decimals:0,           //显示小位数
        	formatter: formatter, //渲染之前格式化
        	onUpdate:null,        //每次更新前的回调方法
        	onComplete:null       //完成更新的回调方法
        };
        function formatter(value, settings){
        	return value.toFixed(settings.decimals);
        }

        //定时器
        $('.timer').each(count);
        function count(options){
        	var $this=$(this);
        	options=$.extend({}, options||{}, $this.data('countToOptions')||{});
        	$this.countTo(options);
        }