# JSLite

JSLite是一个使用Java实现的脚本语言解释器，花费几个小时完成。

由于不愿花费太多精力去手写词法分析器和语法分析器，所以使用Antlr生成，并转换成自己的AST(抽象语法树)。

实现了匿名函数和闭包。

语法示例：

示例1：递归
```
def fact(x)
{
  if(x>1)
    return x*fact(x-1);
  else
    return 1;
}
println("6!="+fact(6));
```
输出结果：
6!=720

示例2：闭包
```
var x=1;

def foo()
{
	var x=2;
	def bar()
	{
		return x;
	}
	return bar;
}

println(x);
var f=foo();
println(f());
```
输出结果：
1
2


示例3：匿名函数和闭包实现方式测试
```
var i=0;

var a1,a2,a3;

while(i<3)
{
	if(i==0)
		a1=lambda(){return i;};
	else if(i==1)
		a2=lambda(){return i;};
	else
		a3=lambda(){return i;};
	
	i=i+1;
}

println(a1());
println(a2());
println(a3());
```
输出结果：
3
3
3
可以看出闭包结构是直接把当前环境封装，后面修改闭包中的值，会对前面的闭包产生影响。
如果是捕获变量的值，输出结果应该是0 1 2