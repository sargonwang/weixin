>本文使用idea开发工具快速创建spring-boot 2.0项目

**创建一个简单的maven项目作为父项目，如图**：

![这里写图片描述](http://img.blog.csdn.net/20180423173628134?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHpwNDkyNzgyNDQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

鼠标在项目右键-new-Module
![这里写图片描述](http://img.blog.csdn.net/20180423173756083?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHpwNDkyNzgyNDQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

如图操作  选择左侧`Spring Initializr` 选好jdk版本(需要`1.8`以上) 点击next
![这里写图片描述](http://img.blog.csdn.net/20180423173922969?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHpwNDkyNzgyNDQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

填写好项目信息 ，进入下一步
![这里写图片描述](http://img.blog.csdn.net/20180423174229840?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHpwNDkyNzgyNDQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

选择spring boot 版本并勾选web依赖
![这里写图片描述](http://img.blog.csdn.net/20180423174345344?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHpwNDkyNzgyNDQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

点击next，直接finish即可
然后项目开始下载对应的jar包依赖，耐心等待即可。第一次使用spring-boot 可能久点，等它缓存下来一些依赖包到本地，以后创建这种项目就快了，创建完成项目结构如下：
![这里写图片描述](http://img.blog.csdn.net/20180423174850345?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHpwNDkyNzgyNDQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

打开DemoApplication.java 文件  运行main方法即可启动spring-boot项目，启动结果如下，运行的是默认端口：8080
![这里写图片描述](http://img.blog.csdn.net/20180423175241490?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbHpwNDkyNzgyNDQy/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


