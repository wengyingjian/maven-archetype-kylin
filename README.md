# maven-archetype-kylin
maven脚手架项目,用于自动生成集成了[kylin](http://github.com/wengyingjian/kylin)模块的项目.

## 一.相关仓库

### 1.[kylin](http://github.com/wengyingjian/kylin)
基于maven的springboot相关组件库.
### 2.[demo-kylin](http;//github.com/wengyingjian/demo-kylin)
集成了此项目依赖的demo项目.

## 二.使用说明

### 源码安装方法

1. 安装kylin项目
- clone kylin 项目到本地
```
git clone http://github.com/wengyingjian/kylin
```
- 安装 kylin项目
```
mvn install
```
2. 安装maven-archetype-kylin项目
- clone maven-archetype-kylin 项目到本地
```
git clone http://github.com/wengyingjian/maven-archetype-kylin
```
- 安装maven-archetype-kylin项目
```
mvn install
```
3. 使用maven-archetype-kylin生成项目
```
mvn archetype:generate \
-DarchetypeGroupId=com.wengyingjian.kylin \
-DarchetypeArtifactId=kylin-archetype \
-DarchetypeVersion=1.0-SNAPSHOT \
-DgroupId=<your-groupId-here> \
-DartifactId=<your-artifactId-here>\
```

        