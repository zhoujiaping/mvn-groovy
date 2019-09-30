java项目，使用maven构建工具，整合groovy代码。

经验：不要使用Grab注解的方式声明依赖，这样需要在pom中引入ivy。
在pom中引入ivy又会有类加载器的问题。
所以，最好是通过pom声明依赖。

执行groovy脚本
编译groovy类
groovy代码中引用java类
java代码中引用groovy类
groovy类作为junit