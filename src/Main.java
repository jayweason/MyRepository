public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 版本控制系统: VCS,Version Control System
        // 1.集中式版本控制系统:SVN,Subversion
        // 2.分布式版本控制系统:Git

        // SVN服务器:taoCode,SVNChina
        // Git服务器:gitee,github

        // Git使用
        // Git安装:
        // 下载地址:https://git-scm.com/downloads

        // 初始化版本库
        // git init
        // 注:当前文件夹中,有文件要进行版本控制

        // git信息配置(首次登陆)
        // git config --global user.name "姓名"
        // git config --global user.email "邮箱"

        // 查看git信息配置
        // git config --global --list

        // 注:
        // --system: 系统
        // --global: 当前用户
        // --local: 当前仓库

        // 查看当前版本库的状态
        // git status

        // 指定某个文件进行版本控制
        // git add

        // 红色: 未进行版本控制的文件
        // 绿色: 新增文件

        // 提交修改
        // git commit -m "注释"

        // 和上个版本进行比较, 查看修改的内容
        // git diff 文件
        // 注: 按q退出查看

        // 查看日志
        // git log (只显示比当前时间节点更早的)
        // git reflog(查看所有日志)

        // HEAD: 当前的指向
        // git reset --hard HEAD^(退回到HEAD指向的前一个指向)
        // git reset --hard HEAD^^(退回到HEAD指向的前两个指向)
        // git reset --hard HEAD~100(退回到HEAD指向的前100个指向)

        // 版本回退(改变HEAD)
        // git reset --hard 版本号
        // git reset --hard 04200f70d116c9a66aee950fb459c5032d2f03f4
        // 简化:(识别唯一)
        // git reset --hard 04200f70

        // 工作区,暂存区,版本区,远程仓库
        // 工作区: 当前编辑的工程
        // 暂存区: 当执行了git add操作,文件会存入暂存区
        // 版本库: 当执行力git commit -m "注释"操作后,会把暂存区的文件提交到版本库;
        // 注:
        // 工作区,暂存区, 版本库都在自己的电脑上
        // 暂存区,版本库在.git文件夹中
        // 远程仓库:git服务器

        // 练习
        // 1.为Girl添加购物方法
        // 2.add
        // 3.添加 休息方法
        // 4.commit

    }
}
