# RuoYi-DKD

基于RuoYi（SpringBoot+Vue前后端分离）的Java快速开发框架

## 🚀 快速启动

- 🗄️ **数据库**：导入 `dkd_backend\sql` 中所有的 SQL 文件，注意需按照一定顺序；
- ⚙️ **后端**：配置 `dkd_backend\dkd-admin\src\main\resources\*.yml` 中的数据库链接和 Redis 链接，并启动 `dkd-admin` 模块。默认端口 8080。
- 💻 **前端**：配置 `dkd_frontend\vite.config.js` 中的后端地址为 `http://localhost:8080`，并`npm install`+`npm run dev`启动。默认端口 2077。

## 内容讲解
项目主要根据[B站视频教程](https://www.bilibili.com/video/BV1pf421B71v)完成的，整体难度偏易。

主要是工作是利用若依的基础，进行二次开发。大量在工作改造前端界面上。完成/听完本项目对于没有前端项目，但有一定前端基础的开发者有一定好处。今后可快速开发一个全栈项目。

亮点解析：

- ⭐: 基于流行的RuoYi框架，快速搭建企业级应用
- ⭐: SpringBoot + Vue前后端分离架构，现代化开发体验
- ⭐: 功能原型达到0代码开发，减少重复开发工作
- ⭐: 适合有一定Java基础，想提升全栈开发能力的学习者
- ⭐: 业务逻辑完整

除了前后端代码，剩余文件夹均为资料里面提供的，详情可以查看B站视频教程里面的介绍。

## 资料链接

| 名称 | 链接 |
|------|------|
| RuoYi | [https://gitee.com/y_project/RuoYi](https://gitee.com/y_project/RuoYi) |
| RuoYi-Vue | [https://gitee.com/y_project/RuoYi-Vue](https://gitee.com/y_project/RuoYi-Vue) |
| RuoYi-Cloud | [https://gitee.com/y_project/RuoYi-Cloud](https://gitee.com/y_project/RuoYi-Cloud) |
| B站视频教程 | [https://www.bilibili.com/video/BV1pf421B71v](https://www.bilibili.com/video/BV1pf421B71v) |
| 百度云资料 | [https://pan.baidu.com/s/1ye_pq_rQVKpLLhOT9DzB8w?pwd=9785](https://pan.baidu.com/s/1ye_pq_rQVKpLLhOT9DzB8w?pwd=9785) |
| 网上已有项目-后端 | [https://gitee.com/xjyzr/heima-by-ruoyi-csdn](https://gitee.com/xjyzr/heima-by-ruoyi-csdn) |
| 网上已有项目-前端 | [https://gitee.com/xjyzr/heima-by-ruoyi-vue-csdn](https://gitee.com/xjyzr/heima-by-ruoyi-vue-csdn) |


## 声明

### 许可证
本项目基于 MIT 许可证开源，您可以自由使用、复制、修改、分发，但需保留原始版权与许可证声明。

### 允许场景
- 个人学习研究
- 非商业教学（如学校 / 公益机构免费授课）
- 内部员工培训
- 二次开发（需注明原项目来源）

### 禁止行为
- ❌ 商用且不保留声明
- ❌ 恶意修改误导他人
- ❌ 侵犯第三方权益（如盗用素材）

### 免责声明
项目按 "现状" 提供，不担保适用于特定场景，作者不对使用过程中的问题承担责任。
