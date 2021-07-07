# smvctest

## Spring MVC+Tomcat

#### 重要两个配置xml: web.xml、spring.xml

### Tomcat 启动

#### 1.创建一个spring容器，存到一个Map,key=WebApplicationContext.class.getName()+".ROOT"

#### 2.实例化得到一个DispatcherServlet的一个对象

#### 3.执行init()--->initServletBean()--->initWebApplicationContext()--->createWebApplicationContext(rootContext)--->