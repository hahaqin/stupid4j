# stupid4j
从零开始写个web框架 此项目为后续框架的示例项目

此项目中以客户的展示，增删改查作为示例展示用最基础的Servlet开发出一套基本业务流程

其中CustomerServlet已经编写完毕其余Servlet不作多余编码。

注意：

CustomerController为之后框架编写完毕之后应用到该项目之后的场景

1：Controller注解标明该类为控制器

2：Inject标明成员变量，自动创建该成员变量实例

3：Action注解用于指定请求类型与请求路径

4：Param对象用于封装所以请求参数

5：View封装jsp，Data封装JSON数据

目的：减少Servlet，屏蔽技术细节，提高开发效率
