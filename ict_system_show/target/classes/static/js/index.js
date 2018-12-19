

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
		$('.right').toggle();
	})	
