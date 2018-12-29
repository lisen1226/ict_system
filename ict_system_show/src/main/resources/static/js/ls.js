$('#member_great_id').click(function(){
/*	var div1_before = '<div class="form-group">';*/
	var lable = '<label class="col-sm-2 control-label">添加成员</label>';
	var div2_before = '<div class="col-sm-10">';
	var span = '<span class="help-block m-b-none"></span>';
	var input = '<input type="text" class="form-control">';
	var div1_after = '</div>';
/*	var div2_after = '</div>';*/
	$('#member_great_content_id').html(lable+div2_before+span+input+div1_after);
});