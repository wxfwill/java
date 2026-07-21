# Java 全栈学习工作区

本仓库用于执行一套基础能力优先的 48 周 Java 全栈学习计划。所有 Java 练习、SQL、Spring Boot 项目、测试与部署配置均保存在本仓库，不进入现有前端项目。

## 当前状态

- Git 仓库：已初始化，默认分支为 `main`
- 远端：`origin` 指向 `https://github.com/wxfwill/java.git`
- 当前阶段：阶段一，Java 语言与工程基础
- 本机环境：已安装 JDK 21 与 Maven 3.9.16，均放在 D 盘
- 主线目标：独立完成企业权限与业务管理平台

## 目录说明

```text
roadmap/                          六个阶段的学习与验收要求
progress/                         48 周进度清单
notes/templates/                  知识笔记和故障复盘模板
exercises/phase-01-java-basics/   第一阶段 Maven 练习工程
exercises/phase-02-sql/           HTTP、SQL 与数据库练习说明
exercises/phase-03-spring/        Spring Boot 练习说明
exercises/phase-04-security/      认证、授权与 Redis 练习说明
exercises/phase-05-operations/    测试、部署与故障练习说明
exercises/phase-06-jvm/           JVM、并发与分布式练习说明
projects/fullstack-admin/         全年主线项目设计与验收入口
infrastructure/                   MySQL、Redis、Nginx、Compose 配置入口
```

## 环境准备

1. 当前 JDK 安装目录：`D:\devtools\jdk\temurin-21`。
2. 当前 Maven 安装目录：`D:\devtools\maven\apache-maven-3.9.16`。
3. Maven 本地依赖仓库：`D:\devtools\maven\repository`。
4. 验证环境：

```powershell
java -version
javac -version
mvn -version
```

4. 进入第一阶段工程：

```powershell
Set-Location D:\code\java\exercises\phase-01-java-basics
mvn test
mvn package
```

## 学习闭环

```text
理解概念
→ 手写最小示例
→ 放入主线项目
→ 制造失败场景
→ 独立排查
→ 编写测试
→ 阅读官方文档核对
→ 形成个人总结
```

## AI 使用边界

- 第 1–16 周：AI 只解释概念、生成无答案练习、检查完成后的代码和补充边界问题。
- 第 17–34 周：AI 可审查代码、SQL、事务和测试，但核心设计必须先由学习者完成。
- 第 35 周以后：AI 可生成重复骨架与辅助重构，但安全、事务、权限、并发和架构仍由人工决策。

## 开始方式

1. 阅读 `roadmap/phase-01-java-basics.md`。
2. 在 `progress/48-week-checklist.md` 记录开始日期。
3. 完成第一阶段环境检查。
4. 只阅读练习需求，不提前查看或生成完整答案。
5. 每周使用知识笔记模板记录关键结论。
