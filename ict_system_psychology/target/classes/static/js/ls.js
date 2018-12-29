var test = [];
var number = "3";
function onload(number) {
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
		success : function(data) {
			console.log(data);
			test = data;
			console.log(test);
			
		}
	});
}




// 答题页面
// 生成答题卡
var testa = [{
	num1:0,
	title:"1.有人像老朋友似的向你打招呼，但你一点也记不起他（她）是谁，此时你会_____？",
	option1:"A.装作没听见似的不搭理1",
	option2:"A.装作没听见似的不搭理1",
	option3:"A.装作没听见似的不搭理1"
},
{
	num1:1,
	title:"2.有人像老朋友似的向你打招呼，但你一点也记不起他（她）是谁，此时你会_____？",
	option1:"A.装作没听见似的不搭理2",
	option2:"A.装作没听见似的不搭理2",
	option3:"A.装作没听见似的不搭理2"
},
{
	num1:2,
	title:"3.有人像老朋友似的向你打招呼，但你一点也记不起他（她）是谁，此时你会_____？",
	option1:"A.装作没听见似的不搭理3",
	option2:"A.装作没听见似的不搭理3",
	option3:"A.装作没听见似的不搭理3"
}]
