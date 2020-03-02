# 作业模板
# 实体仓库
在应用程序中有时候需要管理一系列对象实体（在内存中管理或者持久化到数据库），这就用到了实体仓库的概念。本作业有以下要求：
- 首先定义一个 `Repository` 泛型接口，包含以下5个方法：
- `save(id, entity)`, 保存对象，并与一个String类型的 id 关联起来
- `get(id)`, 根据 id 获取对象
- `delete(id)`, 删除 id 对应的对象
- `update(id, entity)`, 替换 id 对应的对象为新对象
- `list()`, 列出仓库中的所有对象
- 定义一个实现类 `MemoryRepository` 实现在内存中管理对象。
- 定义一个工具类 `RepositoryUtil`，包含一个静态方法 `printList`, 可以将任何对象列表打印到控制台。
- 定义一个学生类，包含一个 String 类型的 id 属性和姓名属性
- 在 App 类中尝试用 `MemoryRepository` 管理学生。先创建一些学生((3,张三)，(4,李四)，(5,王五)，(6,赵六)，(7,钱七))并保存进仓库， 然后从仓库中获取张三并打印，接着从仓库中删除李四。然后新建一个学生(5,冯五)替换仓库中的王五，最后获取仓库中的所有学生并用 `printList` 方法打印到控制台。
