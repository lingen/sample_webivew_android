## Android WebView的几种选择对比

现在的移动开发，一个明显的趋势是HTML占据了越来越重要的位置,H5不再是简单的一个浏览网页的行为，在非常多的APP中，它承担了许多原本许要原生开发的功能；Android的H5支持则是个比较头痛的事情

<!--more-->

笔者在进行IOS开发时，WebView从来都不是问题，在IOS上不仅WebView统一，而且性能极佳，也很少需要考虑兼容性问题；

但这个问题在Android上则表现的非常不一样，由于机型众多，WebView的内核众多，不同手机的WebView的兼容性，性能相差也比较大，如果你的APP在Android上对H5有较高需求，你就需要一个好的解决方案

>笔者现在所在的公司所负责开发的APP，就是一款企业级APP，由于需要对接企业开发的各式各样的H5的业务系统，因此在H5方面要求较高；也因此笔者对这一方面了解稍等有一点

Android WebView的选择有三种方案，分别是

1. 使用Android系统自带的WebView
2. 使用X5内核的WebView
3. 使用基于chrome webkit的crosswalk WebView

如上述三种方案，第1个是最原始的解决方案，第2，3个则分别是腾讯，corsswalk的解决方案

几种方案的对照如下表:

| 方案 | 方案说明| 实际效果 | 优缺点 | html5test分数|
|----------|---------|--------|-------|-------|
| 系统自带WebView | Android默认 | 最差 | 优：没有额外的JAR及负担，原生API 缺: 兼容性，性能在不同手机上显示差别很大 | 最差 |
| X5 WebView | 腾讯产品，微信，QQ浏览器就是使用X5内核 | 一般 | 优：提供了一个兼容性的解决方案,且微信，QQ浏览器都在用，可信度高  缺: 解决的能力一般，而且某些方面反而加大了开发工作量;而且不支持cordova | 一般| 
| crosswalk | 国外为Android提供的一个融合chrome webkit的解决方案 | 最佳 | 优:没有兼容性，性能问题,且支持corodva 缺：18M的包，而且区分不同的arm,x86等CPU | 较佳

笔者有一个较老的华为荣耀3C手机，购置于3年前，分别使用系统自带的WebView,X5 WebView,Crosswalk三种模式访问html5test网站，得出的评分结果分别是:

> 系统自带的WebView
![自带WebView](http://media.openpanda.org/android_webview_orignal.jpeg)

> X5内核WebView
![X5内核](http://media.openpanda.org/android_webview_x5.jpeg)

> Crosswalk WebView
![crosswalk](http://media.openpanda.org/android_webview_crosswalk.jpeg)


如上所述，crosswalk的效果是显而易见；笔者所有公司的APP项目也是使用crosswalk做为Android WebView

1. 使用Chrome Webkit内核，兼容性不存在任何问题
2. 性能佳
3. 支持cordova
4. 支持前端人员可以在PC Chrome上联调

不足：

1. APP包增加了至少18M
2. 不同的CPU系统的包完全不同，笔者APP只支持arm，如果你还要支持X86 CPU，你还得加18M的大小，或者分2个APP


而X5做为腾讯的一款产品，主要目标也是解决兼容性问题，从分数上看，它在H5的支持度上并没有太多的改善；但兼容性方面应该有比较好的改善，同时有微信和QQ浏览器做支撑，也是一个比较好的选择

因此，笔者最终建议如下：

1. 你的APP对WebView需求不高，以纯原生为主，那就不用考虑WebView的兼容性及性能问题，使用系统自带的WebView就可以了
2. 如果你的APP有大量使用到WebView，加载一些H5网页，但在cordova等其它方面有要求，使用X5是一个比较好的选择，毕竟腾讯的实力摆在那，有问题你可以说，微信也是这样的（这个话非常有杀伤力）
3. 类似笔者公司这样的APP，对H5有非常高的要求，大量的业务系统是由H5完成，且需要cordova与原生进行大量的交互 ，那这种情况下,crosswalk是我们唯一的选择，虽然加大了18M，但带来的好处是显而易见的

