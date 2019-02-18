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
    }
}
