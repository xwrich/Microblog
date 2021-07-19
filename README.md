# 化繁为简的小而美型博客
项目介绍：一个化繁为简的个人微型博客项目，支持CRUD功能，目前只有一个后端和博客前端展示页面，没有实现后台管理功能。

## 项目预览
登录
![](https://cdn.jsdelivr.net/gh/OriginalCoder0/gallery@master/images/1626612263901-login.png)

首页
![](https://cdn.jsdelivr.net/gh/OriginalCoder0/gallery@master/images/1626612288664-home.png)

文章详情
![](https://cdn.jsdelivr.net/gh/OriginalCoder0/gallery@master/images/1626612306183-blogdetails.png)

编辑文章
![](https://cdn.jsdelivr.net/gh/OriginalCoder0/gallery@master/images/1626612328009-edit.png)

删除文章
![](https://cdn.jsdelivr.net/gh/OriginalCoder0/gallery@master/images/1626612346250-delete.png)

发布文章
![](https://cdn.jsdelivr.net/gh/OriginalCoder0/gallery@master/images/1626612369723-publish.png)



## 开发环境
|后端|前端|
|-|-|
|IDEA 2020|Vue 2.x|
|MySQL 8.0|Vuex 3.4|
|JDK 8|Vue-Router 3.0|
|Maven 3.6.3|Element-ui 2.15|


## 后端技术栈
+ SpringBoot
+ MyBatis-Plus
+ Shiro
+ Lombok
+ Redis
+ hibernate validator
+ Jwt

## 前端技术栈
+ Vue
+ Element-UI
+ Axios
+ Mavon-editor
+ Markdown-it
+ Github-markdown-css


## 前端

Node.js版本：v12.22.1

Npm版本：6.14.12


## 部署
1. 下载项目
```git
git clone https://github.com/OriginalCoder0/Microblog.git
```
2. 解压
解压项目文件，导入vueblog.sql到数据库中。

3. 导入后端项目，加载依赖
使用IDEA打开vueblog后端项目，加载`pom.xml`中的依赖即可。PS：注意SpringBoot的版本！

修改application.yml的配置信息

开启Redis

4. 导入前端项目，加载依赖
打开控制台，cd 到项目根路径中
```
cd vueblog-web
```
```
npm install
```

```
npm run serve
```