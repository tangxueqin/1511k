package bw.com.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        git常用命令
//
//        git init 初始化一个git仓库
//        git clone 克隆，将gitHup仓库克隆到本地
//        1.git add . 添加到本地仓库
//        2.git commit -m"commit code" 提交代码
//        3.git pull   拉取最新的文件
//        3.git push   (如果不成功：git push origin master)提交到gitHup
//
//        git branch develop1 创建分支(改需求时使用)
//                git checkout develop1  切换分支
//
//        git checkout HEAD 文件.java  冲突
//
//
//        git reset -- herd  回到历史版本
//
//        ls 遍历目录 	tab补全 cd..返回
//
//                git教程
//        https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000
//
//        Git的纯命令操作
//        http://lib.csdn.net/article/git/53659
//
//        Git SSH Key 生成步骤
//        http://blog.csdn.net/hustpzb/article/details/8230454/
    }
}
