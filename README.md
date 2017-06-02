# JSLite

JSlite是一个使用Java实现的脚本语言解释器，花费几个小时完成。

由于不愿花费太多精力去手写词法分析器和语法分析器，所以使用Antlr生成，并转换成自己的AST(抽象语法树)。

实现了匿名函数和闭包。

语法示例：

示例1：递归
def fact(x)
{
  if(x>1)
    return x*fact(x-1);
  else
    return 1;
}



示例2：闭包
var x=1;

def foo()
{
	var x=2;
	def bar()
	{
		return x;
	}
}

println(x);
var f=foo();
println(f());

示例3：闭包实现方式测试
var i=0;

var a1,a2,a3;

while(i<3)
{
	if(i==1)
		a1=lambda(){return i;};
	else if(i==2)
		a2=lambda(){return i;};
	else
		a3=lambda(){return i;};

	i=i+1;
}

println(a1());
println(a2());
println(a3());
