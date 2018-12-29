/**
 * 	ajax验证账号是否被注册
 * @returns
 */
$("#unumber").blur( function () { 
	var unumber = $("#unumber").val();
	if(unumber!=null && unumber!=""){
		$.ajax({
		    url: "verifyunumber",    
		    type:'POST',
		    data: {
		    	unumber:unumber,
		    },
		    success: function(unumbercount){
		    	if (unumbercount == 0) {
		    		$("#unumber_tesulttip").html("该账号可以被注册");
	            }else {
	            	$("#unumber_tesulttip").html("该账号已经被注册，请重新输入");
	            	$(".unumber-num").siblings('.remove').show();
	            }
		    }
		});
	}
});

/**
 * 	ajax验证手机号是否被注册
 * @returns
 */
$("#phone").blur( function () { 
	var phone = $("#phone").val();
	
	if(phone!=null && phone!=""){
	$.ajax({
	    url: "verifyphone",    
	    type:'POST',
	    data: {
	    	phone:phone,
	    },
	    success: function(phonecount){
	    	if (phonecount == 0) {
//	    		alert("该手机号可以被注册");
	    		$("#phone_tesulttip").html("该手机号可以被注册");
	    		$(".phone-num").siblings('.ok-sign').show();
            	$(".phone-num").siblings('.remove').hide();
            }else {
            	$("#phone_tesulttip").html("该手机号已经被注册，请在登陆页面找回");
            }
	    }
	});
//	alert(phone);
	}
});


