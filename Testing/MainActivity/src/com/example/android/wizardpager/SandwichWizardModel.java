package com.example.android.wizardpager;

import com.example.android.wizardpager.wizard.model.AbstractWizardModel;
import com.example.android.wizardpager.wizard.model.BranchPage;
import com.example.android.wizardpager.wizard.model.CustomerInfoPage;
import com.example.android.wizardpager.wizard.model.MultipleFixedChoicePage;
import com.example.android.wizardpager.wizard.model.PageList;
import com.example.android.wizardpager.wizard.model.SingleFixedChoicePage;

import android.content.Context;

public class SandwichWizardModel extends AbstractWizardModel {
    public SandwichWizardModel(Context context) {
        super(context);
    }

    @Override
    protected PageList onNewRootPageList() {
        return new PageList(
                
                                new SingleFixedChoicePage(this, "你的性别")
                                        .setChoices("男", "女")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你是否已婚")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你和家人之间联系密切，与朋友经常相聚")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "评估你目前的压力水平")
                                        .setChoices("低", "高")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你是否善于减压")
                                        .setChoices("善于", "不善于")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "每天的睡眠时间")
                                        .setChoices("3~5个小时", "6小时以上")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你接受过多少年的正规教育")
                                        .setChoices("16年以上", "低于8年")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你一周工作多少小时")
                                        .setChoices("低于40个小时", "40至60个小时")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你对人生逐渐走向衰老感到乐观")
                                        .setChoices("乐观", "悲观")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你居住的地方空气质量很好")
                                        .setChoices("很好", "很差")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "当你在私家车中，你总是会系好安全带")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每天喝多少杯含有咖啡因的咖啡")
                                        .setChoices("2杯以下", "3杯以上")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每天喝2~3杯绿茶")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你吸烟或暴露在二手烟的环境")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每天都吸烟")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每天吸多少支烟")
                                        .setChoices("10支以内", "20支以内","40支以上", "从来不吸")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每天喝饮用啤酒超过3杯，或含酒精的饮品超过3杯，或4杯白酒")
                                        .setChoices("是", "不是")
                                        .setRequired(true), 
                                new SingleFixedChoicePage(this, "你每天服用一片阿司匹林")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "阳光下你会涂抹防晒油来保护皮肤吗")
                                        .setChoices("很少", "会做好防护")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你没有从事危险性行为，也不注射违法药物")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每天都用牙线洁牙吗")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你一周吃多少次快餐和熟食")
                                        .setChoices("从来不吃", "5次以上")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你很少吃烧烤的鱼，家禽或肉类")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每天会补充钙")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "如果在正餐之间吃零食，通常你会选择干果")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你常吃大量的甜食，如冰激凌，蛋糕，糖果等")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每天都吃的很多，肥胖")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你不会把铁作为营养素的一部分来补充 ")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你一周有多少天能达到至少锻炼30分钟")
                                        .setChoices("每周7天", "每周3天","我很少锻炼")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你排便是否规律")
                                        .setChoices("是", "不是")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你的总胆固醇水平高于180mg/dl")
                                        .setChoices("是", "不是","不知道")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你心脏的收缩压是多少")
                                        .setChoices("低于120", "高于230","不知道")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你心脏的舒张压低于80")
                                        .setChoices("是", "不是","不知道")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你每年都做血糖检测")
                                        .setChoices("是", "不是")
                                        .setRequired(true),     
                                new SingleFixedChoicePage(this, "你心脏病两年前发作过，但后来也没有采取任何措施来预防它再次发作")
                                        .setChoices("是", "不是","没有心脏病")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你的直系亲属中是否从来没有患有糖尿病者或心脏病者")
                                        .setChoices("是", "不是","不知道")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "直系亲属中是否有三位或更多的人患有癌症")
                                        .setChoices("是", "不是","不知道")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你母亲活到90岁以上")
                                        .setChoices("是", "不是","不知道")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你父亲活到90岁以上")
                                        .setChoices("是", "不是","不知道")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你的祖父母或曾祖父母中有达到或超过98岁高龄的")
                                        .setChoices("是", "不是","不知道")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "你没有借助任何人工生育手段生育最后一个孩子时是多少岁")
                                        .setChoices("35~43岁", "35岁以下")
                                        .setRequired(true)
               // new CustomerInfoPage(this, "Your info")
                       // .setRequired(true)
        );
    }
}
