package org.yqj.ansj.demo;

import com.google.common.base.Stopwatch;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.nlpcn.commons.lang.jianfan.JianFan;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2018/10/30
 * Email: qijunyao@xiaohongshu.com
 */
public class MainTest {
    public static void main(String[] args) {
        String origin = "还想再看一遍101刚开始比赛的时候";
        ToAnalysis.parse(origin).getTerms().forEach(s-> System.out.println(s.getName()));
    }

    /**
     * 简体繁体相互转换
     */
    public static void jfConvert(){
        System.out.println(JianFan.f2j("生命不息，奮鬥不止"));
        System.out.println(JianFan.j2f("小学生作文大全整理龙龙"));
        System.out.println(JianFan.f2j("小学生作文大全整理龙龙"));
    }

    public static void ansjSplit(String[] args) {
        for (String string : strings) {
            Stopwatch stopwatch = Stopwatch.createStarted();
            int count = ToAnalysis.parse(string).getTerms().size();
            stopwatch.stop();
            System.out.println(String.format("string split total need time is %d, count is %d", stopwatch.elapsed(TimeUnit.MICROSECONDS), count));
        }
    }

    private static String[] strings = {"本文《窗边的小豆豆读后感400字》由小学生作文大全整理，仅供参考。如果觉得很不错，欢迎点评和分享～感谢你的阅读与支持！最近，我看了老师推荐的《窗边的小豆豆》一书。",
            "它讲述了作者上学是时的一段真实故事，作者因淘气而被原来的学校退学后，来到了巴学园，小林校长天天给大家吃山的味道和海的味道，为的是让他们不要挑食。",
            "在小林校长的爱护和引导下，一般人眼里“怪怪”的小豆豆慢慢地变成大家都能接受的好孩子，并尊定了她一生都基础。后来，她发挥出自己的特长，成了三好学生。",
            "这本书有时让我哭笑不得；有时让我泪流满面；还有时让我疑惑不解。比如说着，小豆豆移开石头，把坑哇开。但不可思议的事情发生了，那枚硬币已经消失得无影无踪！",
            "这段话让我很疑惑。“泰明……死了。今天，我们都要参加他的丧礼。泰明是大家的好朋友。真可惜啊，老师们也难过极了……”这段话让我很伤心。",
            "还有但这一回破的样子很奇怪，它不像裙子被钩住了划开那样，而是从背上到屁股那里，共撕开了七个大口子，破破烂烂的像是背上背了一个掸子。这段话让我哭笑不得。",
            "我非常喜欢小林校长独特的教育方法。在我漫长的人生道路上，无数的好书伴我左右。",
            "它们在我遇到困难时助我一臂之力；在我迷茫时替我拨开云雾；在我悲伤时帮我抚平伤痛；在我激动时让我保持理智……当我遇见了《窗边的豆豆》这本书，心中被小豆豆的笑脸所充盈着，",
            "一股暖意从心底蔓延开来。的作者是黑柳彻子，这本书记录了她童年时代的天真烂漫，在巴学园里的美好时代。小豆豆是幸福的，她有爱她的爸爸妈妈，有活泼调皮的洛基",
            "有和蔼可亲的小林宗作老师，小豆豆就在这样的环境下，健康快乐的长大。她的故事，就像白蝴蝶停歇在茉莉花上那样的美好，让人微微一笑，发自内心地感叹：多么快乐的孩子！",
            "小豆豆的妈妈对她无微不至的关爱，让我知道爱，有时也需要善意的谎言；小林宗作老师对小豆豆的理解，让我懂得了真正的爱需要包容与理解；小豆豆和同学们天真纯洁的友谊，",
            "让我知道了友谊，是不分国家、种族和身份尊卑的；小豆豆和洛基在一起的快乐时光，让我懂得当友情变成亲情时，那便再也分不开了……也许这并不是什么大不了的领悟，",
            "但至少会让人感到温暖。这就是小豆豆，一个天真可爱没烦恼的孩子。这本是黑柳彻子写的书，也就是小豆豆（黑柳彻子）",
            "写的童年的自己。书面上有许多的字，每个人都能在这本书里找到自己阳光灿烂的童年。海的味道山的味道、电车教室、暑假开始了、健康树皮、温泉旅行、",
            "一生心愿、从今天开始上学、第一次来车战、只是闹着玩、野炊、尾巴、韵律操。这全是目录里的题目，而且给人一种很好奇的感觉，而且让人想去读。",
            "小豆豆讲述了作者上小学时一段真实的故事。作者因为淘气，被原学校退学后，来到巴学校园。在小林校长的爱护和引导下，",
            "一般人眼里“怪怪”的小豆豆逐渐变成一个大家都能接受的孩子，并奠定了她一生的基础",
            "欢迎使用ansj_seg,(ansj中文分词)在这里如果你遇到什么问题都可以联系我.我一定尽我所能.帮助大家.ansj_seg更快,更准,更自由!"};
}
