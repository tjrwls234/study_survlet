package com.yojulab.study_survlet;

import java.util.ArrayList;
import java.util.HashMap;

import com.yojulab.study_survlet.beans.MemberBean;

public class DataInfor {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "김석진");
        searchForm.put("id", "ID0001    ");
        return searchForm;
    }

    public ArrayList<String> getTableListWithString() {
        ArrayList<String> tableListWithString = new ArrayList<String>();
        tableListWithString.add("@mdo");
        tableListWithString.add("@fat");
        tableListWithString.add("@twitter");

        return tableListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfor dataInfor = new DataInfor();
        HashMap<String, String> searchForm = dataInfor.getSearchFormData();
        ArrayList<String> tableListWithString = dataInfor.getTableListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tableListWithString", tableListWithString);
        bundlesData.put("getDataWithMemberBean", dataInfor.getDataWithMemberBean());
        bundlesData.put("getDataListWithMemberBean", dataInfor.getDataListWithMemberBean());
        return bundlesData;

    }

    public MemberBean getDataWithMemberBean() {
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");

        return memberBean;
    }

    public ArrayList<MemberBean> getDataListWithMemberBean() {
        ArrayList<MemberBean> memebersList = new ArrayList<>();
        MemberBean memberBean = new MemberBean();
        memberBean.setFirstName("Mark");
        memberBean.setSecondName("Otto");
        memberBean.setHandleName("@mdo");
        memebersList.add(memberBean);

        MemberBean memberBean02 = new MemberBean();
        memberBean02.setFirstName("Jacob");
        memberBean02.setSecondName("Thornton");
        memberBean02.setHandleName("@fat");
        memebersList.add(memberBean02);

        MemberBean memberBean03 = new MemberBean();
        memberBean03.setFirstName("Larry");
        memberBean03.setSecondName("Bird");
        memberBean03.setHandleName("@twitter");
        memebersList.add(memberBean03);
        return memebersList;
    }

}
