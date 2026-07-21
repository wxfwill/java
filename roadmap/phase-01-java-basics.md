# 阶段一：Java 语言与工程基础

## 目标

不借助 AI 生成代码，独立建立 Java 对象模型、集合处理、异常处理、Maven 构建和 JUnit 测试能力。

## 知识点

- JDK、JRE、JVM，编译与运行过程
- 基本类型、引用类型、自动装箱与参数传递
- 类、构造器、封装、继承、组合、多态
- 接口、抽象类、重载、重写
- `String`、不可变对象、`equals`、`hashCode`
- `List`、`Set`、`Map`、泛型与上下界
- 枚举、注解、Checked Exception、Runtime Exception
- 文件读写、Lambda、Stream、Optional、日期时间、Record
- Maven 生命周期、依赖 Scope、JUnit 5、IDEA 调试

## 主资料

- Dev.java Learn
- 赫尔辛基大学 Java Programming MOOC 前 5～7 部分
- Maven Getting Started
- JUnit User Guide

## 练习

在 `exercises/phase-01-java-basics` 中手写：

- 用户、角色、菜单实体
- 用户角色与角色菜单关联
- 用户菜单树生成与递归查询
- 集合过滤、分组、排序和去重
- 自定义异常与 CSV 导入
- 至少 20 个包含正常、非法、边界和失败场景的测试

## 注意点

- 不把 TypeScript 泛型、Promise、对象和 Java 对应概念视为完全等价。
- 前期不使用 Lombok、代码生成器和复杂设计模式掩盖基础。
- 遇错先阅读异常、定位自身代码栈、断点检查变量，再查资料。

## 验收

在 2～3 小时内，从空 Maven 项目完成权限对象模型、菜单树、自定义异常、测试、打包，并解释每个类的职责。
