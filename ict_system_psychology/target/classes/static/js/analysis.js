

// 左边侧边栏
$('.analysis-left>div>p').click(function(event) {
	$(this).siblings('ul').toggle();
});