# maven-archetype-kylin
maven脚手架项目,用于自动生成集成了[kylin](http://github.com/wengyingjian/kylin)模块的项目.

## 一.相关仓库

### 1.[kylin](http://github.com/wengyingjian/kylin)
基于maven的springboot相关组件库.
### 2.[demo-kylin](http;//github.com/wengyingjian/demo-kylin)
集成了此项目依赖的demo项目.

## 二.使用说明

### 源码安装方法

#### 1.安装kylin项目

- clone kylin 项目到本地
```
git clone http://github.com/wengyingjian/kylin
```
- 安装 kylin项目
```
mvn install
```
#### 2.安装maven-archetype-kylin项目

- clone maven-archetype-kylin 项目到本地
```
git clone http://github.com/wengyingjian/maven-archetype-kylin
```
- 安装maven-archetype-kylin项目
```
mvn install
```
#### 3.使用maven-archetype-kylin生成项目

```
mvn archetype:generate \
-DarchetypeGroupId=com.wengyingjian.kylin \
-DarchetypeArtifactId=kylin-archetype \
-DarchetypeVersion=1.0-SNAPSHOT \
-DgroupId=<your-groupId-here> \
-DartifactId=<your-artifactId-here>\
```


### 从我的仓库获取
```
//TODO
```

## 三.QA

### 1.项目生成速度过慢
那是因为maven去找了远程仓库的archetype-catalog了,将远程的下载至本地,指定使用本地的即可.  

- 下载:  
```
wget http://repo1.maven.org/maven2/archetype-catalog.xml
```

- 添加自己的archetype到catalog
```
	<archetype>
      <groupId>com.wengyingjian.kylin</groupId>
      <artifactId>kylin-archetype</artifactId>
      <version>1.0-SNAPSHOT</version>
      <description>Blank Project for kylin</description>
    </archetype>
```

- 将catalog移到合适的位置
```
mv archetype-catalog.xml ~/.m2/
```

- 指定使用本地的catalog
```
-DarchetypeCatalog=local  
```

IDEA用户的设置:  
![](http://images2015.cnblogs.com/blog/842598/201601/842598-20160131220246974-1694776895.png)