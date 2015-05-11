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
                
                                new SingleFixedChoicePage(this, "����Ա�")
                                        .setChoices("��", "Ů")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "���Ƿ��ѻ�")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ͼ���֮����ϵ���У������Ѿ������")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "������Ŀǰ��ѹ��ˮƽ")
                                        .setChoices("��", "��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "���Ƿ����ڼ�ѹ")
                                        .setChoices("����", "������")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "ÿ���˯��ʱ��")
                                        .setChoices("3~5��Сʱ", "6Сʱ����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "����ܹ���������������")
                                        .setChoices("16������", "����8��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��һ�ܹ�������Сʱ")
                                        .setChoices("����40��Сʱ", "40��60��Сʱ")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "�������������˥�ϸе��ֹ�")
                                        .setChoices("�ֹ�", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "���ס�ĵط����������ܺ�")
                                        .setChoices("�ܺ�", "�ܲ�")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "������˽�ҳ��У������ǻ�ϵ�ð�ȫ��")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ��ȶ��ٱ����п�����Ŀ���")
                                        .setChoices("2������", "3������")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ���2~3���̲�")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "�����̻�¶�ڶ����̵Ļ���")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ�춼����")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ��������֧��")
                                        .setChoices("10֧����", "20֧����","40֧����", "��������")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ�������ơ�Ƴ���3�����򺬾ƾ�����Ʒ����3������4���׾�")
                                        .setChoices("��", "����")
                                        .setRequired(true), 
                                new SingleFixedChoicePage(this, "��ÿ�����һƬ��˾ƥ��")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "���������ͿĨ��ɹ��������Ƥ����")
                                        .setChoices("����", "�����÷���")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��û�д���Σ������Ϊ��Ҳ��ע��Υ��ҩ��")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ�춼�����߽�����")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��һ�ܳԶ��ٴο�ͺ���ʳ")
                                        .setChoices("��������", "5������")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "����ٳ��տ����㣬���ݻ�����")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ��Ჹ���")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "���������֮�����ʳ��ͨ�����ѡ��ɹ�")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "�㳣�Դ�������ʳ��������裬���⣬�ǹ���")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ�춼�Եĺܶ࣬����")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "�㲻�������ΪӪ���ص�һ���������� ")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��һ���ж������ܴﵽ���ٶ���30����")
                                        .setChoices("ÿ��7��", "ÿ��3��","�Һ��ٶ���")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "���ű��Ƿ����")
                                        .setChoices("��", "����")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "����ܵ��̴�ˮƽ����180mg/dl")
                                        .setChoices("��", "����","��֪��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "�����������ѹ�Ƕ���")
                                        .setChoices("����120", "����230","��֪��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "�����������ѹ����80")
                                        .setChoices("��", "����","��֪��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ÿ�궼��Ѫ�Ǽ��")
                                        .setChoices("��", "����")
                                        .setRequired(true),     
                                new SingleFixedChoicePage(this, "�����ಡ����ǰ��������������Ҳû�в�ȡ�κδ�ʩ��Ԥ�����ٴη���")
                                        .setChoices("��", "����","û�����ಡ")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "���ֱϵ�������Ƿ����û�л��������߻����ಡ��")
                                        .setChoices("��", "����","��֪��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "ֱϵ�������Ƿ�����λ�������˻��а�֢")
                                        .setChoices("��", "����","��֪��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��ĸ�׻90������")
                                        .setChoices("��", "����","��֪��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "�㸸�׻90������")
                                        .setChoices("��", "����","��֪��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "����游ĸ�����游ĸ���дﵽ�򳬹�98������")
                                        .setChoices("��", "����","��֪��")
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "��û�н����κ��˹������ֶ��������һ������ʱ�Ƕ�����")
                                        .setChoices("35~43��", "35������")
                                        .setRequired(true)
               // new CustomerInfoPage(this, "Your info")
                       // .setRequired(true)
        );
    }
}
