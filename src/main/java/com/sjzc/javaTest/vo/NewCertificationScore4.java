package com.sjzc.javaTest.vo;

import com.alibaba.fastjson.JSON;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 14:20 2019/3/18
 */
public class NewCertificationScore4 {
    private String orderNo;
    private String customerId;
    private String customerName;
    private String mobile;
    private String certCardNo;
    private String carrier;
    private String age;
    private String gender;
    private String mobileNameInBlacklist;
    private String idcardNameInBlacklist;
    private String blackTypes;
    private String blackOverdueAmount;
    private String blackOverdueCount;
    private String blackOverdueStatus;
    private String grayTypes;
    private String mobileNameInGray;
    private String idcardNameInGray;
    private String grayOverdueAmount;
    private String grayOverdueCount;
    private String grayOverdueStatus;
    private String registerInfoOtherCount;
    private String registerInfoOrgCount;
    private String queriedDetailOrgCount;
    private String loanOrgCnt;
    private String loanCntX;
    private String suspiciousIdcardOtherNamesCnt;
    private String suspiciousIdcardOtherMobilesCnt;
    private String suspiciousIdcardInformationSourcesCnt;
    private String suspiciousMobileOtherNamesCnt;
    private String suspiciousMobileInformationSourcesCnt;
    private String suspiciousDeviceOtherDevicesCnt;
    private String suspiciousDeviceMobileOtherDevicesCnt;
    private String suspiciousDeviceIdcardOtherDevicesCnt;
    private String suspiciousDeviceInformationSourcesCnt;
    private String suspiciousDeviceOtherNamesCnt;
    private String suspiciousDeviceOtherMobilesCnt;
    private String suspiciousDeviceOtherIdcardsCnt;
    private String loanOrgCntAll;
    private String bankNums;
    private String cardAmount;
    private String totalCreditLimit;
    private String maxCreditLimit;
    private String overdueCard;
    private String billNums;
    private String maxOverdueMoney;
    private String continueOverdueTimes;
    private String matchScore;
    private String mc30DContactnum;
    private String mc30DAuthContactnum;
    private String mc30DAuthContactRatio;
    private String mc30DBlackContactnum;
    private String mc30DBlackContactnumRatio;
    private String mc30DContactType;
    private String mc30DAuthIndirectnum;
    private String mc30DAuthIndirectnumRatio;
    private String mc30DBlackIndirectnum;
    private String mc30DBlackIndirectnumRatio;
    private String mc30DBlackIndirectPeernumRatio;
    private String mc30DAuthIndirectPeernum;
    private String mc30DAuthIndirectPeernumRatio;
    private String mc90DContactnum;
    private String mc90DAuthContactnum;
    private String mc90DAuthContactRatio;
    private String mc90DBlackContactnum;
    private String mc90DBlackContactnumRatio;
    private String mc90DAuthIndirectnum;
    private String mc90DAuthIndirectnumRatio;
    private String mc90DBlackIndirectnum;
    private String mc90DBlackIndirectnumRatio;
    private String mc90DBlackIndirectPeernum;
    private String mc90DBlackIndirectPeernumRatio;
    private String mc90DAuthIndirectPeernum;
    private String mc90DAuthIndirectPeernumRatio;
    private String mc180DContactnum;
    private String mc180DAuthContactnum;
    private String mc180DAuthContactRatio;
    private String mc180DBlackContactnum;
    private String mc180DBlackContactnumRatio;
    private String mc180DContactType;
    private String mc180DAuthIndirectnum;
    private String mc180DAuthIndirectnumRatio;
    private String mc180DBlackIndirectnum;
    private String mc180DBlackIndirectnumRatio;
    private String mc180DBlackIndirectPeernum;
    private String mc180DBlackIndirectPeernumRatio;
    private String mc180DAuthIndirectPeernum;
    private String mc180DAuthIndirectPeernumRatio;
    private String ici30DIntimatenum;
    private String ici30DAuthIntimatenum;
    private String ici30DAuthIntimatenumRatio;
    private String ici30DBlackIntimatenumRatio;
    private String ici30DAuthIntimateIndirectnum;
    private String ici30DAuthIntimateIndirectnumRatio;
    private String ici30DBlackIntimateIndirectnum;
    private String ici30DBlackIntimateIndirectnumRatio;
    private String ici30DBlackIntimateIndirectPeernumRatio;
    private String ici30DAuthIntimateIndirectPeernum;
    private String ici30DAuthIntimateIndirectPeernumRatio;
    private String ici90DIntimatenum;
    private String ici90DAuthIntimatenum;
    private String ici90DAuthIntimatenumRatio;
    private String ici90DBlackIntimatenumRatio;
    private String ici90DAuthIntimateIndirectnum;
    private String ici90DAuthIntimateIndirectnumRatio;
    private String ici90DBlackIntimateIndirectnum;
    private String ici90DBlackIntimateIndirectnumRatio;
    private String ici90DBlackIntimateIndirectPeernum;
    private String ici90DBlackIntimateIndirectPeernumRatio;
    private String ici90DAuthIntimateIndirectPeernum;
    private String ici90DAuthIntimateIndirectPeernumRatio;
    private String ici180DIntimatenum;
    private String ici180DAuthIntimatenum;
    private String ici180DAuthIntimatenumRatio;
    private String ici180DBlackIntimatenum;
    private String ici180DBlackIntimatenumRatio;
    private String ici180DAuthIntimateIndirectnum;
    private String ici180DAuthIntimateIndirectnumRatio;
    private String ici180DBlackIntimateIndirectnum;
    private String ici180DBlackIntimateIndirectnumRatio;
    private String ici180DBlackIntimateIndirectPeernum;
    private String ici180DBlackIntimateIndirectPeernumRatio;
    private String ici180DAuthIntimateIndirectPeernum;
    private String ici180DAuthIntimateIndirectPeernumRatio;
    private String zmScoreInfoZmScore;
    private String huabeiInfoHuabaiLimit;
    private String cashLoan15DCt;
    private String cashLoan30DCt;
    private String cashLoan90DCt;
    private String cashLoan180DCt;
    private String consumstage15DCt;
    private String consumstage30DCt;
    private String consumstage90DCt;
    private String consumstage180DCt;
    private String datacoverge15DCt;
    private String datacoverge30DCt;
    private String datacoverge90DCt;
    private String datacoverge180DCt;
    private String diversion15DCt;
    private String diversion30DCt;
    private String diversion90DCt;
    private String diversion180DCt;
    private String p2P15DCt;
    private String p2P30DCt;
    private String p2P90DCt;
    private String p2P180DCt;
    private String zhengxin15DCt;
    private String zhengxin30DCt;
    private String zhengxin90DCt;
    private String zhengxin180DCt;
    private String other15DCt;
    private String other30DCt;
    private String other90DCt;
    private String other180DCt;
    private String loanCntY;
    private String consumptionCnt;
    private String lotteryCnt;
    private String loanCntRatio;
    private String consumptionCntRatio;
    private String lotteryCntRatio;
    private String deviceCt;
    private String finalScore;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCertCardNo() {
        return certCardNo;
    }

    public void setCertCardNo(String certCardNo) {
        this.certCardNo = certCardNo;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNameInBlacklist() {
        return mobileNameInBlacklist;
    }

    public void setMobileNameInBlacklist(String mobileNameInBlacklist) {
        this.mobileNameInBlacklist = mobileNameInBlacklist;
    }

    public String getIdcardNameInBlacklist() {
        return idcardNameInBlacklist;
    }

    public void setIdcardNameInBlacklist(String idcardNameInBlacklist) {
        this.idcardNameInBlacklist = idcardNameInBlacklist;
    }

    public String getBlackTypes() {
        return blackTypes;
    }

    public void setBlackTypes(String blackTypes) {
        this.blackTypes = blackTypes;
    }

    public String getBlackOverdueAmount() {
        return blackOverdueAmount;
    }

    public void setBlackOverdueAmount(String blackOverdueAmount) {
        this.blackOverdueAmount = blackOverdueAmount;
    }

    public String getBlackOverdueCount() {
        return blackOverdueCount;
    }

    public void setBlackOverdueCount(String blackOverdueCount) {
        this.blackOverdueCount = blackOverdueCount;
    }

    public String getBlackOverdueStatus() {
        return blackOverdueStatus;
    }

    public void setBlackOverdueStatus(String blackOverdueStatus) {
        this.blackOverdueStatus = blackOverdueStatus;
    }

    public String getGrayTypes() {
        return grayTypes;
    }

    public void setGrayTypes(String grayTypes) {
        this.grayTypes = grayTypes;
    }

    public String getMobileNameInGray() {
        return mobileNameInGray;
    }

    public void setMobileNameInGray(String mobileNameInGray) {
        this.mobileNameInGray = mobileNameInGray;
    }

    public String getIdcardNameInGray() {
        return idcardNameInGray;
    }

    public void setIdcardNameInGray(String idcardNameInGray) {
        this.idcardNameInGray = idcardNameInGray;
    }

    public String getGrayOverdueAmount() {
        return grayOverdueAmount;
    }

    public void setGrayOverdueAmount(String grayOverdueAmount) {
        this.grayOverdueAmount = grayOverdueAmount;
    }

    public String getGrayOverdueCount() {
        return grayOverdueCount;
    }

    public void setGrayOverdueCount(String grayOverdueCount) {
        this.grayOverdueCount = grayOverdueCount;
    }

    public String getGrayOverdueStatus() {
        return grayOverdueStatus;
    }

    public void setGrayOverdueStatus(String grayOverdueStatus) {
        this.grayOverdueStatus = grayOverdueStatus;
    }

    public String getRegisterInfoOtherCount() {
        return registerInfoOtherCount;
    }

    public void setRegisterInfoOtherCount(String registerInfoOtherCount) {
        this.registerInfoOtherCount = registerInfoOtherCount;
    }

    public String getRegisterInfoOrgCount() {
        return registerInfoOrgCount;
    }

    public void setRegisterInfoOrgCount(String registerInfoOrgCount) {
        this.registerInfoOrgCount = registerInfoOrgCount;
    }

    public String getQueriedDetailOrgCount() {
        return queriedDetailOrgCount;
    }

    public void setQueriedDetailOrgCount(String queriedDetailOrgCount) {
        this.queriedDetailOrgCount = queriedDetailOrgCount;
    }

    public String getLoanOrgCnt() {
        return loanOrgCnt;
    }

    public void setLoanOrgCnt(String loanOrgCnt) {
        this.loanOrgCnt = loanOrgCnt;
    }

    public String getLoanCntX() {
        return loanCntX;
    }

    public void setLoanCntX(String loanCntX) {
        this.loanCntX = loanCntX;
    }

    public String getSuspiciousIdcardOtherNamesCnt() {
        return suspiciousIdcardOtherNamesCnt;
    }

    public void setSuspiciousIdcardOtherNamesCnt(String suspiciousIdcardOtherNamesCnt) {
        this.suspiciousIdcardOtherNamesCnt = suspiciousIdcardOtherNamesCnt;
    }

    public String getSuspiciousIdcardOtherMobilesCnt() {
        return suspiciousIdcardOtherMobilesCnt;
    }

    public void setSuspiciousIdcardOtherMobilesCnt(String suspiciousIdcardOtherMobilesCnt) {
        this.suspiciousIdcardOtherMobilesCnt = suspiciousIdcardOtherMobilesCnt;
    }

    public String getSuspiciousIdcardInformationSourcesCnt() {
        return suspiciousIdcardInformationSourcesCnt;
    }

    public void setSuspiciousIdcardInformationSourcesCnt(String suspiciousIdcardInformationSourcesCnt) {
        this.suspiciousIdcardInformationSourcesCnt = suspiciousIdcardInformationSourcesCnt;
    }

    public String getSuspiciousMobileOtherNamesCnt() {
        return suspiciousMobileOtherNamesCnt;
    }

    public void setSuspiciousMobileOtherNamesCnt(String suspiciousMobileOtherNamesCnt) {
        this.suspiciousMobileOtherNamesCnt = suspiciousMobileOtherNamesCnt;
    }

    public String getSuspiciousMobileInformationSourcesCnt() {
        return suspiciousMobileInformationSourcesCnt;
    }

    public void setSuspiciousMobileInformationSourcesCnt(String suspiciousMobileInformationSourcesCnt) {
        this.suspiciousMobileInformationSourcesCnt = suspiciousMobileInformationSourcesCnt;
    }

    public String getSuspiciousDeviceOtherDevicesCnt() {
        return suspiciousDeviceOtherDevicesCnt;
    }

    public void setSuspiciousDeviceOtherDevicesCnt(String suspiciousDeviceOtherDevicesCnt) {
        this.suspiciousDeviceOtherDevicesCnt = suspiciousDeviceOtherDevicesCnt;
    }

    public String getSuspiciousDeviceMobileOtherDevicesCnt() {
        return suspiciousDeviceMobileOtherDevicesCnt;
    }

    public void setSuspiciousDeviceMobileOtherDevicesCnt(String suspiciousDeviceMobileOtherDevicesCnt) {
        this.suspiciousDeviceMobileOtherDevicesCnt = suspiciousDeviceMobileOtherDevicesCnt;
    }

    public String getSuspiciousDeviceIdcardOtherDevicesCnt() {
        return suspiciousDeviceIdcardOtherDevicesCnt;
    }

    public void setSuspiciousDeviceIdcardOtherDevicesCnt(String suspiciousDeviceIdcardOtherDevicesCnt) {
        this.suspiciousDeviceIdcardOtherDevicesCnt = suspiciousDeviceIdcardOtherDevicesCnt;
    }

    public String getSuspiciousDeviceInformationSourcesCnt() {
        return suspiciousDeviceInformationSourcesCnt;
    }

    public void setSuspiciousDeviceInformationSourcesCnt(String suspiciousDeviceInformationSourcesCnt) {
        this.suspiciousDeviceInformationSourcesCnt = suspiciousDeviceInformationSourcesCnt;
    }

    public String getSuspiciousDeviceOtherNamesCnt() {
        return suspiciousDeviceOtherNamesCnt;
    }

    public void setSuspiciousDeviceOtherNamesCnt(String suspiciousDeviceOtherNamesCnt) {
        this.suspiciousDeviceOtherNamesCnt = suspiciousDeviceOtherNamesCnt;
    }

    public String getSuspiciousDeviceOtherMobilesCnt() {
        return suspiciousDeviceOtherMobilesCnt;
    }

    public void setSuspiciousDeviceOtherMobilesCnt(String suspiciousDeviceOtherMobilesCnt) {
        this.suspiciousDeviceOtherMobilesCnt = suspiciousDeviceOtherMobilesCnt;
    }

    public String getSuspiciousDeviceOtherIdcardsCnt() {
        return suspiciousDeviceOtherIdcardsCnt;
    }

    public void setSuspiciousDeviceOtherIdcardsCnt(String suspiciousDeviceOtherIdcardsCnt) {
        this.suspiciousDeviceOtherIdcardsCnt = suspiciousDeviceOtherIdcardsCnt;
    }

    public String getLoanOrgCntAll() {
        return loanOrgCntAll;
    }

    public void setLoanOrgCntAll(String loanOrgCntAll) {
        this.loanOrgCntAll = loanOrgCntAll;
    }

    public String getBankNums() {
        return bankNums;
    }

    public void setBankNums(String bankNums) {
        this.bankNums = bankNums;
    }

    public String getCardAmount() {
        return cardAmount;
    }

    public void setCardAmount(String cardAmount) {
        this.cardAmount = cardAmount;
    }

    public String getTotalCreditLimit() {
        return totalCreditLimit;
    }

    public void setTotalCreditLimit(String totalCreditLimit) {
        this.totalCreditLimit = totalCreditLimit;
    }

    public String getMaxCreditLimit() {
        return maxCreditLimit;
    }

    public void setMaxCreditLimit(String maxCreditLimit) {
        this.maxCreditLimit = maxCreditLimit;
    }

    public String getOverdueCard() {
        return overdueCard;
    }

    public void setOverdueCard(String overdueCard) {
        this.overdueCard = overdueCard;
    }

    public String getBillNums() {
        return billNums;
    }

    public void setBillNums(String billNums) {
        this.billNums = billNums;
    }

    public String getMaxOverdueMoney() {
        return maxOverdueMoney;
    }

    public void setMaxOverdueMoney(String maxOverdueMoney) {
        this.maxOverdueMoney = maxOverdueMoney;
    }

    public String getContinueOverdueTimes() {
        return continueOverdueTimes;
    }

    public void setContinueOverdueTimes(String continueOverdueTimes) {
        this.continueOverdueTimes = continueOverdueTimes;
    }

    public String getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(String matchScore) {
        this.matchScore = matchScore;
    }

    public String getMc30DContactnum() {
        return mc30DContactnum;
    }

    public void setMc30DContactnum(String mc30DContactnum) {
        this.mc30DContactnum = mc30DContactnum;
    }

    public String getMc30DAuthContactnum() {
        return mc30DAuthContactnum;
    }

    public void setMc30DAuthContactnum(String mc30DAuthContactnum) {
        this.mc30DAuthContactnum = mc30DAuthContactnum;
    }

    public String getMc30DAuthContactRatio() {
        return mc30DAuthContactRatio;
    }

    public void setMc30DAuthContactRatio(String mc30DAuthContactRatio) {
        this.mc30DAuthContactRatio = mc30DAuthContactRatio;
    }

    public String getMc30DBlackContactnum() {
        return mc30DBlackContactnum;
    }

    public void setMc30DBlackContactnum(String mc30DBlackContactnum) {
        this.mc30DBlackContactnum = mc30DBlackContactnum;
    }

    public String getMc30DBlackContactnumRatio() {
        return mc30DBlackContactnumRatio;
    }

    public void setMc30DBlackContactnumRatio(String mc30DBlackContactnumRatio) {
        this.mc30DBlackContactnumRatio = mc30DBlackContactnumRatio;
    }

    public String getMc30DContactType() {
        return mc30DContactType;
    }

    public void setMc30DContactType(String mc30DContactType) {
        this.mc30DContactType = mc30DContactType;
    }

    public String getMc30DAuthIndirectnum() {
        return mc30DAuthIndirectnum;
    }

    public void setMc30DAuthIndirectnum(String mc30DAuthIndirectnum) {
        this.mc30DAuthIndirectnum = mc30DAuthIndirectnum;
    }

    public String getMc30DAuthIndirectnumRatio() {
        return mc30DAuthIndirectnumRatio;
    }

    public void setMc30DAuthIndirectnumRatio(String mc30DAuthIndirectnumRatio) {
        this.mc30DAuthIndirectnumRatio = mc30DAuthIndirectnumRatio;
    }

    public String getMc30DBlackIndirectnum() {
        return mc30DBlackIndirectnum;
    }

    public void setMc30DBlackIndirectnum(String mc30DBlackIndirectnum) {
        this.mc30DBlackIndirectnum = mc30DBlackIndirectnum;
    }

    public String getMc30DBlackIndirectnumRatio() {
        return mc30DBlackIndirectnumRatio;
    }

    public void setMc30DBlackIndirectnumRatio(String mc30DBlackIndirectnumRatio) {
        this.mc30DBlackIndirectnumRatio = mc30DBlackIndirectnumRatio;
    }

    public String getMc30DBlackIndirectPeernumRatio() {
        return mc30DBlackIndirectPeernumRatio;
    }

    public void setMc30DBlackIndirectPeernumRatio(String mc30DBlackIndirectPeernumRatio) {
        this.mc30DBlackIndirectPeernumRatio = mc30DBlackIndirectPeernumRatio;
    }

    public String getMc30DAuthIndirectPeernum() {
        return mc30DAuthIndirectPeernum;
    }

    public void setMc30DAuthIndirectPeernum(String mc30DAuthIndirectPeernum) {
        this.mc30DAuthIndirectPeernum = mc30DAuthIndirectPeernum;
    }

    public String getMc30DAuthIndirectPeernumRatio() {
        return mc30DAuthIndirectPeernumRatio;
    }

    public void setMc30DAuthIndirectPeernumRatio(String mc30DAuthIndirectPeernumRatio) {
        this.mc30DAuthIndirectPeernumRatio = mc30DAuthIndirectPeernumRatio;
    }

    public String getMc90DContactnum() {
        return mc90DContactnum;
    }

    public void setMc90DContactnum(String mc90DContactnum) {
        this.mc90DContactnum = mc90DContactnum;
    }

    public String getMc90DAuthContactnum() {
        return mc90DAuthContactnum;
    }

    public void setMc90DAuthContactnum(String mc90DAuthContactnum) {
        this.mc90DAuthContactnum = mc90DAuthContactnum;
    }

    public String getMc90DAuthContactRatio() {
        return mc90DAuthContactRatio;
    }

    public void setMc90DAuthContactRatio(String mc90DAuthContactRatio) {
        this.mc90DAuthContactRatio = mc90DAuthContactRatio;
    }

    public String getMc90DBlackContactnum() {
        return mc90DBlackContactnum;
    }

    public void setMc90DBlackContactnum(String mc90DBlackContactnum) {
        this.mc90DBlackContactnum = mc90DBlackContactnum;
    }

    public String getMc90DBlackContactnumRatio() {
        return mc90DBlackContactnumRatio;
    }

    public void setMc90DBlackContactnumRatio(String mc90DBlackContactnumRatio) {
        this.mc90DBlackContactnumRatio = mc90DBlackContactnumRatio;
    }

    public String getMc90DAuthIndirectnum() {
        return mc90DAuthIndirectnum;
    }

    public void setMc90DAuthIndirectnum(String mc90DAuthIndirectnum) {
        this.mc90DAuthIndirectnum = mc90DAuthIndirectnum;
    }

    public String getMc90DAuthIndirectnumRatio() {
        return mc90DAuthIndirectnumRatio;
    }

    public void setMc90DAuthIndirectnumRatio(String mc90DAuthIndirectnumRatio) {
        this.mc90DAuthIndirectnumRatio = mc90DAuthIndirectnumRatio;
    }

    public String getMc90DBlackIndirectnum() {
        return mc90DBlackIndirectnum;
    }

    public void setMc90DBlackIndirectnum(String mc90DBlackIndirectnum) {
        this.mc90DBlackIndirectnum = mc90DBlackIndirectnum;
    }

    public String getMc90DBlackIndirectnumRatio() {
        return mc90DBlackIndirectnumRatio;
    }

    public void setMc90DBlackIndirectnumRatio(String mc90DBlackIndirectnumRatio) {
        this.mc90DBlackIndirectnumRatio = mc90DBlackIndirectnumRatio;
    }

    public String getMc90DBlackIndirectPeernum() {
        return mc90DBlackIndirectPeernum;
    }

    public void setMc90DBlackIndirectPeernum(String mc90DBlackIndirectPeernum) {
        this.mc90DBlackIndirectPeernum = mc90DBlackIndirectPeernum;
    }

    public String getMc90DBlackIndirectPeernumRatio() {
        return mc90DBlackIndirectPeernumRatio;
    }

    public void setMc90DBlackIndirectPeernumRatio(String mc90DBlackIndirectPeernumRatio) {
        this.mc90DBlackIndirectPeernumRatio = mc90DBlackIndirectPeernumRatio;
    }

    public String getMc90DAuthIndirectPeernum() {
        return mc90DAuthIndirectPeernum;
    }

    public void setMc90DAuthIndirectPeernum(String mc90DAuthIndirectPeernum) {
        this.mc90DAuthIndirectPeernum = mc90DAuthIndirectPeernum;
    }

    public String getMc90DAuthIndirectPeernumRatio() {
        return mc90DAuthIndirectPeernumRatio;
    }

    public void setMc90DAuthIndirectPeernumRatio(String mc90DAuthIndirectPeernumRatio) {
        this.mc90DAuthIndirectPeernumRatio = mc90DAuthIndirectPeernumRatio;
    }

    public String getMc180DContactnum() {
        return mc180DContactnum;
    }

    public void setMc180DContactnum(String mc180DContactnum) {
        this.mc180DContactnum = mc180DContactnum;
    }

    public String getMc180DAuthContactnum() {
        return mc180DAuthContactnum;
    }

    public void setMc180DAuthContactnum(String mc180DAuthContactnum) {
        this.mc180DAuthContactnum = mc180DAuthContactnum;
    }

    public String getMc180DAuthContactRatio() {
        return mc180DAuthContactRatio;
    }

    public void setMc180DAuthContactRatio(String mc180DAuthContactRatio) {
        this.mc180DAuthContactRatio = mc180DAuthContactRatio;
    }

    public String getMc180DBlackContactnum() {
        return mc180DBlackContactnum;
    }

    public void setMc180DBlackContactnum(String mc180DBlackContactnum) {
        this.mc180DBlackContactnum = mc180DBlackContactnum;
    }

    public String getMc180DBlackContactnumRatio() {
        return mc180DBlackContactnumRatio;
    }

    public void setMc180DBlackContactnumRatio(String mc180DBlackContactnumRatio) {
        this.mc180DBlackContactnumRatio = mc180DBlackContactnumRatio;
    }

    public String getMc180DContactType() {
        return mc180DContactType;
    }

    public void setMc180DContactType(String mc180DContactType) {
        this.mc180DContactType = mc180DContactType;
    }

    public String getMc180DAuthIndirectnum() {
        return mc180DAuthIndirectnum;
    }

    public void setMc180DAuthIndirectnum(String mc180DAuthIndirectnum) {
        this.mc180DAuthIndirectnum = mc180DAuthIndirectnum;
    }

    public String getMc180DAuthIndirectnumRatio() {
        return mc180DAuthIndirectnumRatio;
    }

    public void setMc180DAuthIndirectnumRatio(String mc180DAuthIndirectnumRatio) {
        this.mc180DAuthIndirectnumRatio = mc180DAuthIndirectnumRatio;
    }

    public String getMc180DBlackIndirectnum() {
        return mc180DBlackIndirectnum;
    }

    public void setMc180DBlackIndirectnum(String mc180DBlackIndirectnum) {
        this.mc180DBlackIndirectnum = mc180DBlackIndirectnum;
    }

    public String getMc180DBlackIndirectnumRatio() {
        return mc180DBlackIndirectnumRatio;
    }

    public void setMc180DBlackIndirectnumRatio(String mc180DBlackIndirectnumRatio) {
        this.mc180DBlackIndirectnumRatio = mc180DBlackIndirectnumRatio;
    }

    public String getMc180DBlackIndirectPeernum() {
        return mc180DBlackIndirectPeernum;
    }

    public void setMc180DBlackIndirectPeernum(String mc180DBlackIndirectPeernum) {
        this.mc180DBlackIndirectPeernum = mc180DBlackIndirectPeernum;
    }

    public String getMc180DBlackIndirectPeernumRatio() {
        return mc180DBlackIndirectPeernumRatio;
    }

    public void setMc180DBlackIndirectPeernumRatio(String mc180DBlackIndirectPeernumRatio) {
        this.mc180DBlackIndirectPeernumRatio = mc180DBlackIndirectPeernumRatio;
    }

    public String getMc180DAuthIndirectPeernum() {
        return mc180DAuthIndirectPeernum;
    }

    public void setMc180DAuthIndirectPeernum(String mc180DAuthIndirectPeernum) {
        this.mc180DAuthIndirectPeernum = mc180DAuthIndirectPeernum;
    }

    public String getMc180DAuthIndirectPeernumRatio() {
        return mc180DAuthIndirectPeernumRatio;
    }

    public void setMc180DAuthIndirectPeernumRatio(String mc180DAuthIndirectPeernumRatio) {
        this.mc180DAuthIndirectPeernumRatio = mc180DAuthIndirectPeernumRatio;
    }

    public String getIci30DIntimatenum() {
        return ici30DIntimatenum;
    }

    public void setIci30DIntimatenum(String ici30DIntimatenum) {
        this.ici30DIntimatenum = ici30DIntimatenum;
    }

    public String getIci30DAuthIntimatenum() {
        return ici30DAuthIntimatenum;
    }

    public void setIci30DAuthIntimatenum(String ici30DAuthIntimatenum) {
        this.ici30DAuthIntimatenum = ici30DAuthIntimatenum;
    }

    public String getIci30DAuthIntimatenumRatio() {
        return ici30DAuthIntimatenumRatio;
    }

    public void setIci30DAuthIntimatenumRatio(String ici30DAuthIntimatenumRatio) {
        this.ici30DAuthIntimatenumRatio = ici30DAuthIntimatenumRatio;
    }

    public String getIci30DBlackIntimatenumRatio() {
        return ici30DBlackIntimatenumRatio;
    }

    public void setIci30DBlackIntimatenumRatio(String ici30DBlackIntimatenumRatio) {
        this.ici30DBlackIntimatenumRatio = ici30DBlackIntimatenumRatio;
    }

    public String getIci30DAuthIntimateIndirectnum() {
        return ici30DAuthIntimateIndirectnum;
    }

    public void setIci30DAuthIntimateIndirectnum(String ici30DAuthIntimateIndirectnum) {
        this.ici30DAuthIntimateIndirectnum = ici30DAuthIntimateIndirectnum;
    }

    public String getIci30DAuthIntimateIndirectnumRatio() {
        return ici30DAuthIntimateIndirectnumRatio;
    }

    public void setIci30DAuthIntimateIndirectnumRatio(String ici30DAuthIntimateIndirectnumRatio) {
        this.ici30DAuthIntimateIndirectnumRatio = ici30DAuthIntimateIndirectnumRatio;
    }

    public String getIci30DBlackIntimateIndirectnum() {
        return ici30DBlackIntimateIndirectnum;
    }

    public void setIci30DBlackIntimateIndirectnum(String ici30DBlackIntimateIndirectnum) {
        this.ici30DBlackIntimateIndirectnum = ici30DBlackIntimateIndirectnum;
    }

    public String getIci30DBlackIntimateIndirectnumRatio() {
        return ici30DBlackIntimateIndirectnumRatio;
    }

    public void setIci30DBlackIntimateIndirectnumRatio(String ici30DBlackIntimateIndirectnumRatio) {
        this.ici30DBlackIntimateIndirectnumRatio = ici30DBlackIntimateIndirectnumRatio;
    }

    public String getIci30DBlackIntimateIndirectPeernumRatio() {
        return ici30DBlackIntimateIndirectPeernumRatio;
    }

    public void setIci30DBlackIntimateIndirectPeernumRatio(String ici30DBlackIntimateIndirectPeernumRatio) {
        this.ici30DBlackIntimateIndirectPeernumRatio = ici30DBlackIntimateIndirectPeernumRatio;
    }

    public String getIci30DAuthIntimateIndirectPeernum() {
        return ici30DAuthIntimateIndirectPeernum;
    }

    public void setIci30DAuthIntimateIndirectPeernum(String ici30DAuthIntimateIndirectPeernum) {
        this.ici30DAuthIntimateIndirectPeernum = ici30DAuthIntimateIndirectPeernum;
    }

    public String getIci30DAuthIntimateIndirectPeernumRatio() {
        return ici30DAuthIntimateIndirectPeernumRatio;
    }

    public void setIci30DAuthIntimateIndirectPeernumRatio(String ici30DAuthIntimateIndirectPeernumRatio) {
        this.ici30DAuthIntimateIndirectPeernumRatio = ici30DAuthIntimateIndirectPeernumRatio;
    }

    public String getIci90DIntimatenum() {
        return ici90DIntimatenum;
    }

    public void setIci90DIntimatenum(String ici90DIntimatenum) {
        this.ici90DIntimatenum = ici90DIntimatenum;
    }

    public String getIci90DAuthIntimatenum() {
        return ici90DAuthIntimatenum;
    }

    public void setIci90DAuthIntimatenum(String ici90DAuthIntimatenum) {
        this.ici90DAuthIntimatenum = ici90DAuthIntimatenum;
    }

    public String getIci90DAuthIntimatenumRatio() {
        return ici90DAuthIntimatenumRatio;
    }

    public void setIci90DAuthIntimatenumRatio(String ici90DAuthIntimatenumRatio) {
        this.ici90DAuthIntimatenumRatio = ici90DAuthIntimatenumRatio;
    }

    public String getIci90DBlackIntimatenumRatio() {
        return ici90DBlackIntimatenumRatio;
    }

    public void setIci90DBlackIntimatenumRatio(String ici90DBlackIntimatenumRatio) {
        this.ici90DBlackIntimatenumRatio = ici90DBlackIntimatenumRatio;
    }

    public String getIci90DAuthIntimateIndirectnum() {
        return ici90DAuthIntimateIndirectnum;
    }

    public void setIci90DAuthIntimateIndirectnum(String ici90DAuthIntimateIndirectnum) {
        this.ici90DAuthIntimateIndirectnum = ici90DAuthIntimateIndirectnum;
    }

    public String getIci90DAuthIntimateIndirectnumRatio() {
        return ici90DAuthIntimateIndirectnumRatio;
    }

    public void setIci90DAuthIntimateIndirectnumRatio(String ici90DAuthIntimateIndirectnumRatio) {
        this.ici90DAuthIntimateIndirectnumRatio = ici90DAuthIntimateIndirectnumRatio;
    }

    public String getIci90DBlackIntimateIndirectnum() {
        return ici90DBlackIntimateIndirectnum;
    }

    public void setIci90DBlackIntimateIndirectnum(String ici90DBlackIntimateIndirectnum) {
        this.ici90DBlackIntimateIndirectnum = ici90DBlackIntimateIndirectnum;
    }

    public String getIci90DBlackIntimateIndirectnumRatio() {
        return ici90DBlackIntimateIndirectnumRatio;
    }

    public void setIci90DBlackIntimateIndirectnumRatio(String ici90DBlackIntimateIndirectnumRatio) {
        this.ici90DBlackIntimateIndirectnumRatio = ici90DBlackIntimateIndirectnumRatio;
    }

    public String getIci90DBlackIntimateIndirectPeernum() {
        return ici90DBlackIntimateIndirectPeernum;
    }

    public void setIci90DBlackIntimateIndirectPeernum(String ici90DBlackIntimateIndirectPeernum) {
        this.ici90DBlackIntimateIndirectPeernum = ici90DBlackIntimateIndirectPeernum;
    }

    public String getIci90DBlackIntimateIndirectPeernumRatio() {
        return ici90DBlackIntimateIndirectPeernumRatio;
    }

    public void setIci90DBlackIntimateIndirectPeernumRatio(String ici90DBlackIntimateIndirectPeernumRatio) {
        this.ici90DBlackIntimateIndirectPeernumRatio = ici90DBlackIntimateIndirectPeernumRatio;
    }

    public String getIci90DAuthIntimateIndirectPeernum() {
        return ici90DAuthIntimateIndirectPeernum;
    }

    public void setIci90DAuthIntimateIndirectPeernum(String ici90DAuthIntimateIndirectPeernum) {
        this.ici90DAuthIntimateIndirectPeernum = ici90DAuthIntimateIndirectPeernum;
    }

    public String getIci90DAuthIntimateIndirectPeernumRatio() {
        return ici90DAuthIntimateIndirectPeernumRatio;
    }

    public void setIci90DAuthIntimateIndirectPeernumRatio(String ici90DAuthIntimateIndirectPeernumRatio) {
        this.ici90DAuthIntimateIndirectPeernumRatio = ici90DAuthIntimateIndirectPeernumRatio;
    }

    public String getIci180DIntimatenum() {
        return ici180DIntimatenum;
    }

    public void setIci180DIntimatenum(String ici180DIntimatenum) {
        this.ici180DIntimatenum = ici180DIntimatenum;
    }

    public String getIci180DAuthIntimatenum() {
        return ici180DAuthIntimatenum;
    }

    public void setIci180DAuthIntimatenum(String ici180DAuthIntimatenum) {
        this.ici180DAuthIntimatenum = ici180DAuthIntimatenum;
    }

    public String getIci180DAuthIntimatenumRatio() {
        return ici180DAuthIntimatenumRatio;
    }

    public void setIci180DAuthIntimatenumRatio(String ici180DAuthIntimatenumRatio) {
        this.ici180DAuthIntimatenumRatio = ici180DAuthIntimatenumRatio;
    }

    public String getIci180DBlackIntimatenum() {
        return ici180DBlackIntimatenum;
    }

    public void setIci180DBlackIntimatenum(String ici180DBlackIntimatenum) {
        this.ici180DBlackIntimatenum = ici180DBlackIntimatenum;
    }

    public String getIci180DBlackIntimatenumRatio() {
        return ici180DBlackIntimatenumRatio;
    }

    public void setIci180DBlackIntimatenumRatio(String ici180DBlackIntimatenumRatio) {
        this.ici180DBlackIntimatenumRatio = ici180DBlackIntimatenumRatio;
    }

    public String getIci180DAuthIntimateIndirectnum() {
        return ici180DAuthIntimateIndirectnum;
    }

    public void setIci180DAuthIntimateIndirectnum(String ici180DAuthIntimateIndirectnum) {
        this.ici180DAuthIntimateIndirectnum = ici180DAuthIntimateIndirectnum;
    }

    public String getIci180DAuthIntimateIndirectnumRatio() {
        return ici180DAuthIntimateIndirectnumRatio;
    }

    public void setIci180DAuthIntimateIndirectnumRatio(String ici180DAuthIntimateIndirectnumRatio) {
        this.ici180DAuthIntimateIndirectnumRatio = ici180DAuthIntimateIndirectnumRatio;
    }

    public String getIci180DBlackIntimateIndirectnum() {
        return ici180DBlackIntimateIndirectnum;
    }

    public void setIci180DBlackIntimateIndirectnum(String ici180DBlackIntimateIndirectnum) {
        this.ici180DBlackIntimateIndirectnum = ici180DBlackIntimateIndirectnum;
    }

    public String getIci180DBlackIntimateIndirectnumRatio() {
        return ici180DBlackIntimateIndirectnumRatio;
    }

    public void setIci180DBlackIntimateIndirectnumRatio(String ici180DBlackIntimateIndirectnumRatio) {
        this.ici180DBlackIntimateIndirectnumRatio = ici180DBlackIntimateIndirectnumRatio;
    }

    public String getIci180DBlackIntimateIndirectPeernum() {
        return ici180DBlackIntimateIndirectPeernum;
    }

    public void setIci180DBlackIntimateIndirectPeernum(String ici180DBlackIntimateIndirectPeernum) {
        this.ici180DBlackIntimateIndirectPeernum = ici180DBlackIntimateIndirectPeernum;
    }

    public String getIci180DBlackIntimateIndirectPeernumRatio() {
        return ici180DBlackIntimateIndirectPeernumRatio;
    }

    public void setIci180DBlackIntimateIndirectPeernumRatio(String ici180DBlackIntimateIndirectPeernumRatio) {
        this.ici180DBlackIntimateIndirectPeernumRatio = ici180DBlackIntimateIndirectPeernumRatio;
    }

    public String getIci180DAuthIntimateIndirectPeernum() {
        return ici180DAuthIntimateIndirectPeernum;
    }

    public void setIci180DAuthIntimateIndirectPeernum(String ici180DAuthIntimateIndirectPeernum) {
        this.ici180DAuthIntimateIndirectPeernum = ici180DAuthIntimateIndirectPeernum;
    }

    public String getIci180DAuthIntimateIndirectPeernumRatio() {
        return ici180DAuthIntimateIndirectPeernumRatio;
    }

    public void setIci180DAuthIntimateIndirectPeernumRatio(String ici180DAuthIntimateIndirectPeernumRatio) {
        this.ici180DAuthIntimateIndirectPeernumRatio = ici180DAuthIntimateIndirectPeernumRatio;
    }

    public String getZmScoreInfoZmScore() {
        return zmScoreInfoZmScore;
    }

    public void setZmScoreInfoZmScore(String zmScoreInfoZmScore) {
        this.zmScoreInfoZmScore = zmScoreInfoZmScore;
    }

    public String getHuabeiInfoHuabaiLimit() {
        return huabeiInfoHuabaiLimit;
    }

    public void setHuabeiInfoHuabaiLimit(String huabeiInfoHuabaiLimit) {
        this.huabeiInfoHuabaiLimit = huabeiInfoHuabaiLimit;
    }

    public String getCashLoan15DCt() {
        return cashLoan15DCt;
    }

    public void setCashLoan15DCt(String cashLoan15DCt) {
        this.cashLoan15DCt = cashLoan15DCt;
    }

    public String getCashLoan30DCt() {
        return cashLoan30DCt;
    }

    public void setCashLoan30DCt(String cashLoan30DCt) {
        this.cashLoan30DCt = cashLoan30DCt;
    }

    public String getCashLoan90DCt() {
        return cashLoan90DCt;
    }

    public void setCashLoan90DCt(String cashLoan90DCt) {
        this.cashLoan90DCt = cashLoan90DCt;
    }

    public String getCashLoan180DCt() {
        return cashLoan180DCt;
    }

    public void setCashLoan180DCt(String cashLoan180DCt) {
        this.cashLoan180DCt = cashLoan180DCt;
    }

    public String getConsumstage15DCt() {
        return consumstage15DCt;
    }

    public void setConsumstage15DCt(String consumstage15DCt) {
        this.consumstage15DCt = consumstage15DCt;
    }

    public String getConsumstage30DCt() {
        return consumstage30DCt;
    }

    public void setConsumstage30DCt(String consumstage30DCt) {
        this.consumstage30DCt = consumstage30DCt;
    }

    public String getConsumstage90DCt() {
        return consumstage90DCt;
    }

    public void setConsumstage90DCt(String consumstage90DCt) {
        this.consumstage90DCt = consumstage90DCt;
    }

    public String getConsumstage180DCt() {
        return consumstage180DCt;
    }

    public void setConsumstage180DCt(String consumstage180DCt) {
        this.consumstage180DCt = consumstage180DCt;
    }

    public String getDatacoverge15DCt() {
        return datacoverge15DCt;
    }

    public void setDatacoverge15DCt(String datacoverge15DCt) {
        this.datacoverge15DCt = datacoverge15DCt;
    }

    public String getDatacoverge30DCt() {
        return datacoverge30DCt;
    }

    public void setDatacoverge30DCt(String datacoverge30DCt) {
        this.datacoverge30DCt = datacoverge30DCt;
    }

    public String getDatacoverge90DCt() {
        return datacoverge90DCt;
    }

    public void setDatacoverge90DCt(String datacoverge90DCt) {
        this.datacoverge90DCt = datacoverge90DCt;
    }

    public String getDatacoverge180DCt() {
        return datacoverge180DCt;
    }

    public void setDatacoverge180DCt(String datacoverge180DCt) {
        this.datacoverge180DCt = datacoverge180DCt;
    }

    public String getDiversion15DCt() {
        return diversion15DCt;
    }

    public void setDiversion15DCt(String diversion15DCt) {
        this.diversion15DCt = diversion15DCt;
    }

    public String getDiversion30DCt() {
        return diversion30DCt;
    }

    public void setDiversion30DCt(String diversion30DCt) {
        this.diversion30DCt = diversion30DCt;
    }

    public String getDiversion90DCt() {
        return diversion90DCt;
    }

    public void setDiversion90DCt(String diversion90DCt) {
        this.diversion90DCt = diversion90DCt;
    }

    public String getDiversion180DCt() {
        return diversion180DCt;
    }

    public void setDiversion180DCt(String diversion180DCt) {
        this.diversion180DCt = diversion180DCt;
    }

    public String getP2P15DCt() {
        return p2P15DCt;
    }

    public void setP2P15DCt(String p2P15DCt) {
        this.p2P15DCt = p2P15DCt;
    }

    public String getP2P30DCt() {
        return p2P30DCt;
    }

    public void setP2P30DCt(String p2P30DCt) {
        this.p2P30DCt = p2P30DCt;
    }

    public String getP2P90DCt() {
        return p2P90DCt;
    }

    public void setP2P90DCt(String p2P90DCt) {
        this.p2P90DCt = p2P90DCt;
    }

    public String getP2P180DCt() {
        return p2P180DCt;
    }

    public void setP2P180DCt(String p2P180DCt) {
        this.p2P180DCt = p2P180DCt;
    }

    public String getZhengxin15DCt() {
        return zhengxin15DCt;
    }

    public void setZhengxin15DCt(String zhengxin15DCt) {
        this.zhengxin15DCt = zhengxin15DCt;
    }

    public String getZhengxin30DCt() {
        return zhengxin30DCt;
    }

    public void setZhengxin30DCt(String zhengxin30DCt) {
        this.zhengxin30DCt = zhengxin30DCt;
    }

    public String getZhengxin90DCt() {
        return zhengxin90DCt;
    }

    public void setZhengxin90DCt(String zhengxin90DCt) {
        this.zhengxin90DCt = zhengxin90DCt;
    }

    public String getZhengxin180DCt() {
        return zhengxin180DCt;
    }

    public void setZhengxin180DCt(String zhengxin180DCt) {
        this.zhengxin180DCt = zhengxin180DCt;
    }

    public String getOther15DCt() {
        return other15DCt;
    }

    public void setOther15DCt(String other15DCt) {
        this.other15DCt = other15DCt;
    }

    public String getOther30DCt() {
        return other30DCt;
    }

    public void setOther30DCt(String other30DCt) {
        this.other30DCt = other30DCt;
    }

    public String getOther90DCt() {
        return other90DCt;
    }

    public void setOther90DCt(String other90DCt) {
        this.other90DCt = other90DCt;
    }

    public String getOther180DCt() {
        return other180DCt;
    }

    public void setOther180DCt(String other180DCt) {
        this.other180DCt = other180DCt;
    }

    public String getLoanCntY() {
        return loanCntY;
    }

    public void setLoanCntY(String loanCntY) {
        this.loanCntY = loanCntY;
    }

    public String getConsumptionCnt() {
        return consumptionCnt;
    }

    public void setConsumptionCnt(String consumptionCnt) {
        this.consumptionCnt = consumptionCnt;
    }

    public String getLotteryCnt() {
        return lotteryCnt;
    }

    public void setLotteryCnt(String lotteryCnt) {
        this.lotteryCnt = lotteryCnt;
    }

    public String getLoanCntRatio() {
        return loanCntRatio;
    }

    public void setLoanCntRatio(String loanCntRatio) {
        this.loanCntRatio = loanCntRatio;
    }

    public String getConsumptionCntRatio() {
        return consumptionCntRatio;
    }

    public void setConsumptionCntRatio(String consumptionCntRatio) {
        this.consumptionCntRatio = consumptionCntRatio;
    }

    public String getLotteryCntRatio() {
        return lotteryCntRatio;
    }

    public void setLotteryCntRatio(String lotteryCntRatio) {
        this.lotteryCntRatio = lotteryCntRatio;
    }

    public String getDeviceCt() {
        return deviceCt;
    }

    public void setDeviceCt(String deviceCt) {
        this.deviceCt = deviceCt;
    }

    public String getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;
    }

    public String toString() {
        return JSON.toJSON(this).toString();
    }
}
