
$('.exam-func>ol>li').eq(0).click(function(){
	test();
	$('.technology').hide();
	$('.psychological').show();
})
$('.exam-func>ol>li').eq(1).click(function(){
	test();
	$('.psychological').hide();
	$('.technology').show();
})

function test(){
	$('.exam-pic').hide();
	$('.exam-explain').show();
	if ($(window).width()<=768) {
		$('.exam-func').hide();
	}
}