package com.sjzc.javaTest;

import com.alibaba.fastjson.JSONObject;
import com.sjzc.javaTest.vo.NewCertificationScore4;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author sjzc
 * @Description: XXX
 * @Date: Created in 15:03 2019/3/20
 */
public class JsonArrayStreamTest {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"trans_id\": \"007ab550-4266-11e9-934e-00163e0cb827\",\n" +
                "    \"person_info\": {\n" +
                "        \"idcard\": \"42112719940220****\",\n" +
                "        \"idcard_location\": \"湖北省/黄冈市/黄梅县\",\n" +
                "        \"mobile\": \"1997284****\",\n" +
                "        \"carrier\": \"中国电信\",\n" +
                "        \"mobile_location\": \"湖北/黄冈\",\n" +
                "        \"name\": \"胡*\",\n" +
                "        \"age\": 25,\n" +
                "        \"gender\": \"男\",\n" +
                "        \"email\": \"\",\n" +
                "        \"education_info\": {\n" +
                "            \"level\": 0,\n" +
                "            \"is_graduation\": false\n" +
                "        }\n" +
                "    },\n" +
                "    \"verification_info\": {\n" +
                "        \"has_carrier_data\": true\n" +
                "    },\n" +
                "    \"black_info_detail\": {\n" +
                "        \"mobile_name_in_blacklist\": false,\n" +
                "        \"mobile_name_blacklist_updated_time\": \"\",\n" +
                "        \"idcard_name_in_blacklist\": false,\n" +
                "        \"idcard_name_blacklist_updated_time\": \"\",\n" +
                "        \"black_types\": \"\",\n" +
                "        \"blacklist_record\": {\n" +
                "            \"overdue_count\": 0,\n" +
                "            \"overdue_amount\": \"\",\n" +
                "            \"overdue_status\": \"\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"gray_info_detail\": {\n" +
                "        \"mobile_name_in_gray\": false,\n" +
                "        \"mobile_name_gray_updated_time\": \"\",\n" +
                "        \"idcard_name_in_gray\": false,\n" +
                "        \"idcard_name_gray_updated_time\": \"\",\n" +
                "        \"gray_types\": \"\",\n" +
                "        \"graylist_record\": {\n" +
                "            \"overdue_count\": 0,\n" +
                "            \"overdue_amount\": \"\",\n" +
                "            \"overdue_status\": \"\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"mobile_info\": {\n" +
                "        \"match_score\": 100,\n" +
                "        \"mobile_contact_30d\": {\n" +
                "            \"contactnum\": 6,\n" +
                "            \"auth_contactnum\": 0,\n" +
                "            \"auth_contact_ratio\": \"0.00\",\n" +
                "            \"black_contactnum\": 0,\n" +
                "            \"black_contactnum_ratio\": \"0.00\",\n" +
                "            \"contact_type\": \"\",\n" +
                "            \"auth_indirectnum\": 0,\n" +
                "            \"auth_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_indirectnum\": 0,\n" +
                "            \"black_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_indirect_peernum\": 0,\n" +
                "            \"black_indirect_peernum_ratio\": \"0.00\",\n" +
                "            \"auth_indirect_peernum\": 0,\n" +
                "            \"auth_indirect_peernum_ratio\": \"0.00\"\n" +
                "        },\n" +
                "        \"intimate_contact_info_30d\": {\n" +
                "            \"intimatenum\": 2,\n" +
                "            \"auth_intimatenum\": 0,\n" +
                "            \"auth_intimatenum_ratio\": \"0.00\",\n" +
                "            \"black_intimatenum\": 0,\n" +
                "            \"black_intimatenum_ratio\": \"0.00\",\n" +
                "            \"intimate_type\": \"\",\n" +
                "            \"auth_intimate_indirectnum\": 0,\n" +
                "            \"auth_intimate_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_intimate_indirectnum\": 0,\n" +
                "            \"black_intimate_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_intimate_indirect_peernum\": 0,\n" +
                "            \"black_intimate_indirect_peernum_ratio\": \"0.00\",\n" +
                "            \"auth_intimate_indirect_peernum\": 0,\n" +
                "            \"auth_intimate_indirect_peernum_ratio\": \"0.00\"\n" +
                "        },\n" +
                "        \"mobile_contact_90d\": {\n" +
                "            \"contactnum\": 14,\n" +
                "            \"auth_contactnum\": 0,\n" +
                "            \"auth_contact_ratio\": \"0.00\",\n" +
                "            \"black_contactnum\": 0,\n" +
                "            \"black_contactnum_ratio\": \"0.00\",\n" +
                "            \"contact_type\": \"\",\n" +
                "            \"auth_indirectnum\": 0,\n" +
                "            \"auth_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_indirectnum\": 0,\n" +
                "            \"black_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_indirect_peernum\": 0,\n" +
                "            \"black_indirect_peernum_ratio\": \"0.00\",\n" +
                "            \"auth_indirect_peernum\": 0,\n" +
                "            \"auth_indirect_peernum_ratio\": \"0.00\"\n" +
                "        },\n" +
                "        \"intimate_contact_info_90d\": {\n" +
                "            \"intimatenum\": 6,\n" +
                "            \"auth_intimatenum\": 0,\n" +
                "            \"auth_intimatenum_ratio\": \"0.00\",\n" +
                "            \"black_intimatenum\": 0,\n" +
                "            \"black_intimatenum_ratio\": \"0.00\",\n" +
                "            \"intimate_type\": \"\",\n" +
                "            \"auth_intimate_indirectnum\": 0,\n" +
                "            \"auth_intimate_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_intimate_indirectnum\": 0,\n" +
                "            \"black_intimate_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_intimate_indirect_peernum\": 0,\n" +
                "            \"black_intimate_indirect_peernum_ratio\": \"0.00\",\n" +
                "            \"auth_intimate_indirect_peernum\": 0,\n" +
                "            \"auth_intimate_indirect_peernum_ratio\": \"0.00\"\n" +
                "        },\n" +
                "        \"mobile_contact_180d\": {\n" +
                "            \"contactnum\": 25,\n" +
                "            \"auth_contactnum\": 1,\n" +
                "            \"auth_contact_ratio\": \"0.04\",\n" +
                "            \"black_contactnum\": 0,\n" +
                "            \"black_contactnum_ratio\": \"0.00\",\n" +
                "            \"contact_type\": \"\",\n" +
                "            \"auth_indirectnum\": 0,\n" +
                "            \"auth_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_indirectnum\": 0,\n" +
                "            \"black_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_indirect_peernum\": 0,\n" +
                "            \"black_indirect_peernum_ratio\": \"0.00\",\n" +
                "            \"auth_indirect_peernum\": 0,\n" +
                "            \"auth_indirect_peernum_ratio\": \"0.00\"\n" +
                "        },\n" +
                "        \"intimate_contact_info_180d\": {\n" +
                "            \"intimatenum\": 9,\n" +
                "            \"auth_intimatenum\": 1,\n" +
                "            \"auth_intimatenum_ratio\": \"0.11\",\n" +
                "            \"black_intimatenum\": 0,\n" +
                "            \"black_intimatenum_ratio\": \"0.00\",\n" +
                "            \"intimate_type\": \"\",\n" +
                "            \"auth_intimate_indirectnum\": 0,\n" +
                "            \"auth_intimate_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_intimate_indirectnum\": 0,\n" +
                "            \"black_intimate_indirectnum_ratio\": \"0.00\",\n" +
                "            \"black_intimate_indirect_peernum\": 0,\n" +
                "            \"black_intimate_indirect_peernum_ratio\": \"0.00\",\n" +
                "            \"auth_intimate_indirect_peernum\": 0,\n" +
                "            \"auth_intimate_indirect_peernum_ratio\": \"0.00\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"auth_queried_detail\": {\n" +
                "        \"register_info\": {\n" +
                "            \"other_count\": 0,\n" +
                "            \"org_count\": 9,\n" +
                "            \"org_types\": [\n" +
                "                \"CONSUMSTAGE\",\n" +
                "                \"CASH_LOAN\",\n" +
                "                \"其它\"\n" +
                "            ]\n" +
                "        },\n" +
                "        \"queried_detail_org_count\": 11,\n" +
                "        \"queried_analyze\": [\n" +
                "            {\n" +
                "                \"org_type\": \"其它\",\n" +
                "                \"loan_cnt_15d\": 0,\n" +
                "                \"loan_cnt_30d\": 4,\n" +
                "                \"loan_cnt_90d\": 4,\n" +
                "                \"loan_cnt_180d\": 4\n" +
                "            },\n" +
                "            {\n" +
                "                \"org_type\": \"CONSUMSTAGE\",\n" +
                "                \"loan_cnt_15d\": 0,\n" +
                "                \"loan_cnt_30d\": 0,\n" +
                "                \"loan_cnt_90d\": 2,\n" +
                "                \"loan_cnt_180d\": 2\n" +
                "            },\n" +
                "            {\n" +
                "                \"org_type\": \"CASH_LOAN\",\n" +
                "                \"loan_cnt_15d\": 1,\n" +
                "                \"loan_cnt_30d\": 3,\n" +
                "                \"loan_cnt_90d\": 5,\n" +
                "                \"loan_cnt_180d\": 5\n" +
                "            }\n" +
                "        ],\n" +
                "        \"queried_infos\": [\n" +
                "            {\n" +
                "                \"date\": \"2019-02-06\",\n" +
                "                \"org_type\": \"CONSUMSTAGE\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-02-08\",\n" +
                "                \"org_type\": \"CASH_LOAN\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-01-04\",\n" +
                "                \"org_type\": \"CASH_LOAN\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-02-07\",\n" +
                "                \"org_type\": \"CASH_LOAN\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-03-09\",\n" +
                "                \"org_type\": \"CASH_LOAN\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-02-06\",\n" +
                "                \"org_type\": \"CONSUMSTAGE\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-02-10\",\n" +
                "                \"org_type\": \"其它\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-02-11\",\n" +
                "                \"org_type\": \"其它\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-02-12\",\n" +
                "                \"org_type\": \"其它\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-02-14\",\n" +
                "                \"org_type\": \"CASH_LOAN\",\n" +
                "                \"is_self\": false\n" +
                "            },\n" +
                "            {\n" +
                "                \"date\": \"2019-02-11\",\n" +
                "                \"org_type\": \"其它\",\n" +
                "                \"is_self\": false\n" +
                "            }\n" +
                "        ],\n" +
                "        \"loan_org_cnt_all\": 0,\n" +
                "        \"loan_info\": {\n" +
                "            \"loan_org_cnt\": 0,\n" +
                "            \"loan_cnt\": 0,\n" +
                "            \"loan_org_cnt_15d\": 0,\n" +
                "            \"loan_org_cnt_30d\": 0,\n" +
                "            \"loan_org_cnt_90d\": 0,\n" +
                "            \"loan_org_cnt_180d\": 0,\n" +
                "            \"loan_cnt_15d\": 0,\n" +
                "            \"loan_cnt_30d\": 0,\n" +
                "            \"loan_cnt_90d\": 0,\n" +
                "            \"loan_cnt_180d\": 0\n" +
                "        }\n" +
                "    },\n" +
                "    \"untrusted_info\": {\n" +
                "        \"courtcase_cnt\": 0,\n" +
                "        \"dishonest_cnt\": 0,\n" +
                "        \"dishonest_detail_info\": [\n" +
                "            \n" +
                "        ]\n" +
                "    },\n" +
                "    \"suspicious_idcard\": {\n" +
                "        \"other_names_cnt\": 0,\n" +
                "        \"other_mobiles_cnt\": 1,\n" +
                "        \"other_mobiles_black_cnt\": 0,\n" +
                "        \"information_sources_cnt\": 8,\n" +
                "        \"other_names\": [\n" +
                "            \n" +
                "        ],\n" +
                "        \"other_mobiles\": [\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-03-09 20:19:42\",\n" +
                "                \"mobile\": \"1772522****\",\n" +
                "                \"carrier\": \"CHINA_TELECOM\",\n" +
                "                \"mobile_location\": \"青海\",\n" +
                "                \"isblack\": false\n" +
                "            }\n" +
                "        ],\n" +
                "        \"information_sources\": [\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-06 07:35:52\",\n" +
                "                \"org_type\": \"CONSUMSTAGE\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-06 13:56:03\",\n" +
                "                \"org_type\": \"CONSUMSTAGE\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-07 08:18:29\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-08 11:18:43\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-11 19:28:24\",\n" +
                "                \"org_type\": \"其它\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-12 21:03:46\",\n" +
                "                \"org_type\": \"其它\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-14 01:35:31\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-03-09 20:19:42\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"suspicious_mobile\": {\n" +
                "        \"other_names_cnt\": 0,\n" +
                "        \"other_idcards_cnt\": 0,\n" +
                "        \"other_idcards_black_cnt\": 0,\n" +
                "        \"information_sources_cnt\": 6,\n" +
                "        \"other_names\": [\n" +
                "            \n" +
                "        ],\n" +
                "        \"other_idcards\": [\n" +
                "            \n" +
                "        ],\n" +
                "        \"information_sources\": [\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-06 07:35:52\",\n" +
                "                \"org_type\": \"CONSUMSTAGE\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-06 13:56:03\",\n" +
                "                \"org_type\": \"CONSUMSTAGE\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-07 08:18:29\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-08 11:18:43\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-11 19:28:24\",\n" +
                "                \"org_type\": \"其它\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-14 01:35:31\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"suspicious_device\": {\n" +
                "        \"other_devices_cnt\": 2,\n" +
                "        \"mobile_other_devices_cnt\": 2,\n" +
                "        \"idcard_other_devices_cnt\": 2,\n" +
                "        \"information_sources_cnt\": 5,\n" +
                "        \"other_names_cnt\": 0,\n" +
                "        \"other_mobiles_cnt\": 1,\n" +
                "        \"other_mobiles_black_cnt\": 0,\n" +
                "        \"other_idcards_cnt\": 0,\n" +
                "        \"other_idcards_black_cnt\": 0,\n" +
                "        \"other_names\": [\n" +
                "            \n" +
                "        ],\n" +
                "        \"other_mobiles\": [\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-11 19:22:17\",\n" +
                "                \"mobile\": \"1772522****\",\n" +
                "                \"carrier\": \"CHINA_TELECOM\",\n" +
                "                \"mobile_location\": \"青海\",\n" +
                "                \"isblack\": false\n" +
                "            }\n" +
                "        ],\n" +
                "        \"other_idcards\": [\n" +
                "            \n" +
                "        ],\n" +
                "        \"information_sources\": [\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-06 13:58:07\",\n" +
                "                \"org_type\": \"CONSUMSTAGE\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-07 08:18:29\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-11 19:22:17\",\n" +
                "                \"org_type\": \"其它\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-11 19:28:24\",\n" +
                "                \"org_type\": \"其它\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"latest_used_time\": \"2019-02-14 01:35:31\",\n" +
                "                \"org_type\": \"CASH_LOAN\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    \"risk_device\": [\n" +
                "        {\n" +
                "            \"loan_cnt\": 0,\n" +
                "            \"consumption_cnt\": 0,\n" +
                "            \"lottery_cnt\": 0,\n" +
                "            \"loan_cnt_ratio\": \"0.00\",\n" +
                "            \"consumption_cnt_ratio\": \"0.00\",\n" +
                "            \"lottery_cnt_ratio\": \"0.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"loan_cnt\": 2,\n" +
                "            \"consumption_cnt\": 0,\n" +
                "            \"lottery_cnt\": 0,\n" +
                "            \"loan_cnt_ratio\": \"0.05\",\n" +
                "            \"consumption_cnt_ratio\": \"0.00\",\n" +
                "            \"lottery_cnt_ratio\": \"0.00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"loan_cnt\": 0,\n" +
                "            \"consumption_cnt\": 0,\n" +
                "            \"lottery_cnt\": 0,\n" +
                "            \"loan_cnt_ratio\": \"0.00\",\n" +
                "            \"consumption_cnt_ratio\": \"0.00\",\n" +
                "            \"lottery_cnt_ratio\": \"0.00\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"credit_card\": {\n" +
                "        \"update_date\": \"\",\n" +
                "        \"bank_nums\": 0,\n" +
                "        \"card_amount\": 0,\n" +
                "        \"total_credit_limit\": \"\",\n" +
                "        \"max_credit_limit\": \"\",\n" +
                "        \"overdue_card\": 0,\n" +
                "        \"bill_nums\": 0,\n" +
                "        \"credit_overdue_item_12m\": {\n" +
                "            \"overdue_times\": 0,\n" +
                "            \"overdue_months\": 0\n" +
                "        },\n" +
                "        \"credit_overdue_item_6m\": {\n" +
                "            \"overdue_times\": 0,\n" +
                "            \"overdue_months\": 0\n" +
                "        },\n" +
                "        \"credit_overdue_item_3m\": {\n" +
                "            \"overdue_times\": 0,\n" +
                "            \"overdue_months\": 0\n" +
                "        },\n" +
                "        \"last_overdue_date\": \"\",\n" +
                "        \"max_overdue_money\": \"\",\n" +
                "        \"continue_overdue_times\": 0\n" +
                "    },\n" +
                "    \"fund_infos\": [\n" +
                "        \n" +
                "    ],\n" +
                "    \"qualification_info\": {\n" +
                "        \"zm_score_info\": {\n" +
                "            \"last_modify_time\": \"2019-02-08\",\n" +
                "            \"zm_score\": \"优秀\"\n" +
                "        },\n" +
                "        \"huabei_info\": {\n" +
                "            \"last_modify_time\": \"2019-02-08 11:18:19\",\n" +
                "            \"huabai_limit\": \"1000~2000\"\n" +
                "        },\n" +
                "        \"jiebei_info\": {\n" +
                "            \"last_modify_time\": \"\",\n" +
                "            \"credit_amt\": \"\"\n" +
                "        }\n" +
                "    },\n" +
                "    \"fraudulence_info\": {\n" +
                "        \"is_hit\": false,\n" +
                "        \"type\": \"\"\n" +
                "    }\n" +
                "}";
        JSONObject dataJson = JSONObject.parseObject(json);
        NewCertificationScore4 newCertificationScore4 = new NewCertificationScore4();
        newCertificationScore4.setCarrier(dataJson.getJSONObject("person_info").getString("carrier"));
        newCertificationScore4.setAge(dataJson.getJSONObject("person_info").getString("age"));
        newCertificationScore4.setGender(dataJson.getJSONObject("person_info").getString("gender"));
        newCertificationScore4.setMobileNameInBlacklist(dataJson.getJSONObject("black_info_detail").getString("mobile_name_in_blacklist"));
        newCertificationScore4.setIdcardNameInBlacklist(dataJson.getJSONObject("black_info_detail").getString("idcard_name_in_blacklist"));
        newCertificationScore4.setBlackTypes(dataJson.getJSONObject("black_info_detail").getString("black_types"));
        newCertificationScore4.setBlackOverdueAmount(dataJson.getJSONObject("black_info_detail").getJSONObject("blacklist_record").getString("overdue_amount"));
        newCertificationScore4.setBlackOverdueCount(dataJson.getJSONObject("black_info_detail").getJSONObject("blacklist_record").getString("overdue_count"));
        newCertificationScore4.setBlackOverdueStatus(dataJson.getJSONObject("black_info_detail").getJSONObject("blacklist_record").getString("overdue_status"));
        newCertificationScore4.setGrayTypes(dataJson.getJSONObject("gray_info_detail").getString("gray_types"));
        newCertificationScore4.setMobileNameInGray(dataJson.getJSONObject("gray_info_detail").getString("mobile_name_in_gray"));
        newCertificationScore4.setIdcardNameInGray(dataJson.getJSONObject("gray_info_detail").getString("idcard_name_in_gray"));
        newCertificationScore4.setGrayOverdueAmount(dataJson.getJSONObject("gray_info_detail").getJSONObject("graylist_record").getString("overdue_amount"));
        newCertificationScore4.setGrayOverdueCount(dataJson.getJSONObject("gray_info_detail").getJSONObject("graylist_record").getString("overdue_count"));
        newCertificationScore4.setGrayOverdueStatus(dataJson.getJSONObject("gray_info_detail").getJSONObject("graylist_record").getString("overdue_status"));
        newCertificationScore4.setRegisterInfoOtherCount(dataJson.getJSONObject("auth_queried_detail").getJSONObject("register_info").getString("other_count"));
        newCertificationScore4.setRegisterInfoOrgCount(dataJson.getJSONObject("auth_queried_detail").getJSONObject("register_info").getString("org_count"));
        newCertificationScore4.setQueriedDetailOrgCount(dataJson.getJSONObject("auth_queried_detail").getString("queried_detail_org_count"));
        newCertificationScore4.setLoanOrgCnt(dataJson.getJSONObject("auth_queried_detail").getJSONObject("loan_info").getString("loan_org_cnt"));
        newCertificationScore4.setLoanCntX(dataJson.getJSONObject("auth_queried_detail").getJSONObject("loan_info").getString("loan_cnt"));
        newCertificationScore4.setSuspiciousIdcardOtherNamesCnt(dataJson.getJSONObject("suspicious_idcard").getString("other_names_cnt"));
        newCertificationScore4.setSuspiciousIdcardOtherMobilesCnt(dataJson.getJSONObject("suspicious_idcard").getString("other_mobiles_cnt"));
        newCertificationScore4.setSuspiciousIdcardInformationSourcesCnt(dataJson.getJSONObject("suspicious_idcard").getString("information_sources_cnt"));
        newCertificationScore4.setSuspiciousMobileOtherNamesCnt(dataJson.getJSONObject("suspicious_mobile").getString("other_names_cnt"));
        newCertificationScore4.setSuspiciousMobileInformationSourcesCnt(dataJson.getJSONObject("suspicious_mobile").getString("information_sources_cnt"));
        newCertificationScore4.setSuspiciousDeviceOtherDevicesCnt(dataJson.getJSONObject("suspicious_device").getString("other_devices_cnt"));
        newCertificationScore4.setSuspiciousDeviceMobileOtherDevicesCnt(dataJson.getJSONObject("suspicious_device").getString("mobile_other_devices_cnt"));
        newCertificationScore4.setSuspiciousDeviceIdcardOtherDevicesCnt(dataJson.getJSONObject("suspicious_device").getString("idcard_other_devices_cnt"));
        newCertificationScore4.setSuspiciousDeviceInformationSourcesCnt(dataJson.getJSONObject("suspicious_device").getString("information_sources_cnt"));
        newCertificationScore4.setSuspiciousDeviceOtherNamesCnt(dataJson.getJSONObject("suspicious_device").getString("other_names_cnt"));
        newCertificationScore4.setSuspiciousDeviceOtherMobilesCnt(dataJson.getJSONObject("suspicious_device").getString("other_mobiles_cnt"));
        newCertificationScore4.setSuspiciousDeviceOtherIdcardsCnt(dataJson.getJSONObject("suspicious_device").getString("other_idcards_cnt"));
        newCertificationScore4.setLoanOrgCntAll(dataJson.getJSONObject("auth_queried_detail").getString("loan_org_cnt_all"));
        newCertificationScore4.setBankNums(dataJson.getJSONObject("credit_card").getString("bank_nums"));
        newCertificationScore4.setCardAmount(dataJson.getJSONObject("credit_card").getString("card_amount"));
        newCertificationScore4.setTotalCreditLimit(dataJson.getJSONObject("credit_card").getString("total_credit_limit"));
        newCertificationScore4.setMaxCreditLimit(dataJson.getJSONObject("credit_card").getString("max_credit_limit"));
        newCertificationScore4.setOverdueCard(dataJson.getJSONObject("credit_card").getString("overdue_card"));
        newCertificationScore4.setBillNums(dataJson.getJSONObject("credit_card").getString("bill_nums"));
        newCertificationScore4.setMaxOverdueMoney(dataJson.getJSONObject("credit_card").getString("max_overdue_money"));
        newCertificationScore4.setContinueOverdueTimes(dataJson.getJSONObject("credit_card").getString("continue_overdue_times"));
        newCertificationScore4.setMatchScore(dataJson.getJSONObject("mobile_info").getString("match_score"));

        newCertificationScore4.setMc30DContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("contactnum"));
        newCertificationScore4.setMc30DAuthContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("auth_contactnum"));
        newCertificationScore4.setMc30DAuthContactRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("auth_contact_ratio"));
        newCertificationScore4.setMc30DBlackContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("black_contactnum"));
        newCertificationScore4.setMc30DBlackContactnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("black_contactnum_ratio"));
        newCertificationScore4.setMc30DContactType(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("contact_type"));
        newCertificationScore4.setMc30DAuthIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("auth_indirectnum"));
        newCertificationScore4.setMc30DAuthIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("auth_indirectnum_ratio"));
        newCertificationScore4.setMc30DBlackIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("black_indirectnum"));
        newCertificationScore4.setMc30DBlackIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("black_indirectnum_ratio"));
        newCertificationScore4.setMc30DBlackIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("black_indirect_peernum_ratio"));
        newCertificationScore4.setMc30DAuthIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("auth_indirect_peernum"));
        newCertificationScore4.setMc30DAuthIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_30d").getString("auth_indirect_peernum_ratio"));

        newCertificationScore4.setMc90DContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("contactnum"));
        newCertificationScore4.setMc90DAuthContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("auth_contactnum"));
        newCertificationScore4.setMc90DAuthContactRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("auth_contact_ratio"));
        newCertificationScore4.setMc90DBlackContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("black_contactnum"));
        newCertificationScore4.setMc90DBlackContactnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("black_contactnum_ratio"));
        newCertificationScore4.setMc90DAuthIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("auth_indirectnum"));
        newCertificationScore4.setMc90DAuthIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("auth_indirectnum_ratio"));
        newCertificationScore4.setMc90DBlackIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("black_indirectnum"));
        newCertificationScore4.setMc90DBlackIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("black_indirectnum_ratio"));
        newCertificationScore4.setMc90DBlackIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("black_indirect_peernum"));
        newCertificationScore4.setMc90DBlackIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("black_indirect_peernum_ratio"));
        newCertificationScore4.setMc90DAuthIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("auth_indirect_peernum"));
        newCertificationScore4.setMc90DAuthIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_90d").getString("auth_indirect_peernum_ratio"));

        newCertificationScore4.setMc180DContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("contactnum"));
        newCertificationScore4.setMc180DAuthContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("auth_contactnum"));
        newCertificationScore4.setMc180DAuthContactRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("auth_contact_ratio"));
        newCertificationScore4.setMc180DBlackContactnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("black_contactnum"));
        newCertificationScore4.setMc180DBlackContactnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("black_contactnum_ratio"));
        newCertificationScore4.setMc180DContactType(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("contact_type"));
        newCertificationScore4.setMc180DAuthIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("auth_indirectnum"));
        newCertificationScore4.setMc180DAuthIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("auth_indirectnum_ratio"));
        newCertificationScore4.setMc180DBlackIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("black_indirectnum"));
        newCertificationScore4.setMc180DBlackIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("black_indirectnum_ratio"));
        newCertificationScore4.setMc180DBlackIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("black_indirect_peernum"));
        newCertificationScore4.setMc180DBlackIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("black_indirect_peernum_ratio"));
        newCertificationScore4.setMc180DAuthIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("auth_indirect_peernum"));
        newCertificationScore4.setMc180DAuthIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("mobile_contact_180d").getString("auth_indirect_peernum_ratio"));

        newCertificationScore4.setIci30DIntimatenum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("intimatenum"));
        newCertificationScore4.setIci30DAuthIntimatenum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("auth_intimatenum"));
        newCertificationScore4.setIci30DAuthIntimatenumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("auth_intimatenum_ratio"));
        newCertificationScore4.setIci30DBlackIntimatenumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("black_intimatenum_ratio"));
        newCertificationScore4.setIci30DAuthIntimateIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("auth_intimate_indirectnum"));
        newCertificationScore4.setIci30DAuthIntimateIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("auth_intimate_indirectnum_ratio"));
        newCertificationScore4.setIci30DBlackIntimateIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("black_intimate_indirectnum"));
        newCertificationScore4.setIci30DBlackIntimateIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("black_intimate_indirectnum_ratio"));
        newCertificationScore4.setIci30DBlackIntimateIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("black_intimate_indirect_peernum_ratio"));
        newCertificationScore4.setIci30DAuthIntimateIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("black_intimate_indirect_peernum"));
        newCertificationScore4.setIci30DAuthIntimateIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_30d").getString("auth_intimate_indirect_peernum_ratio"));

        newCertificationScore4.setIci90DIntimatenum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("intimatenum"));
        newCertificationScore4.setIci90DAuthIntimatenum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("auth_intimatenum"));
        newCertificationScore4.setIci90DAuthIntimatenumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("auth_intimatenum_ratio"));
        newCertificationScore4.setIci90DBlackIntimatenumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("black_intimatenum_ratio"));
        newCertificationScore4.setIci90DAuthIntimateIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("auth_intimate_indirectnum"));
        newCertificationScore4.setIci90DAuthIntimateIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("auth_intimate_indirectnum_ratio"));
        newCertificationScore4.setIci90DBlackIntimateIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("black_intimate_indirectnum"));
        newCertificationScore4.setIci90DBlackIntimateIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("black_intimate_indirectnum_ratio"));
        newCertificationScore4.setIci90DBlackIntimateIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("black_intimate_indirect_peernum"));
        newCertificationScore4.setIci90DBlackIntimateIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("black_intimate_indirect_peernum_ratio"));
        newCertificationScore4.setIci90DAuthIntimateIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("auth_intimate_indirect_peernum"));
        newCertificationScore4.setIci90DAuthIntimateIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_90d").getString("auth_intimate_indirect_peernum_ratio"));

        newCertificationScore4.setIci180DIntimatenum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("intimatenum"));
        newCertificationScore4.setIci180DAuthIntimatenum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("auth_intimatenum"));
        newCertificationScore4.setIci180DAuthIntimatenumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("auth_intimatenum_ratio"));
        newCertificationScore4.setIci180DBlackIntimatenum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("black_intimatenum"));
        newCertificationScore4.setIci180DBlackIntimatenumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("black_intimatenum_ratio"));
        newCertificationScore4.setIci180DAuthIntimateIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("auth_intimate_indirectnum"));
        newCertificationScore4.setIci180DAuthIntimateIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("auth_intimate_indirectnum_ratio"));
        newCertificationScore4.setIci180DBlackIntimateIndirectnum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("black_intimate_indirectnum"));
        newCertificationScore4.setIci180DBlackIntimateIndirectnumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("black_intimate_indirectnum_ratio"));
        newCertificationScore4.setIci180DBlackIntimateIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("black_intimate_indirect_peernum"));
        newCertificationScore4.setIci180DBlackIntimateIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("black_intimate_indirect_peernum_ratio"));
        newCertificationScore4.setIci180DAuthIntimateIndirectPeernum(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("auth_intimate_indirect_peernum"));
        newCertificationScore4.setIci180DAuthIntimateIndirectPeernumRatio(dataJson.getJSONObject("mobile_info").getJSONObject("intimate_contact_info_180d").getString("auth_intimate_indirect_peernum_ratio"));

        newCertificationScore4.setZmScoreInfoZmScore(dataJson.getJSONObject("qualification_info").getJSONObject("zm_score_info").getString("zm_score"));
        newCertificationScore4.setHuabeiInfoHuabaiLimit(dataJson.getJSONObject("qualification_info").getJSONObject("huabei_info").getString("huabai_limit"));

        Predicate<Object> predicate = new Predicate<Object>() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        List<Object> collect = dataJson.getJSONObject("auth_queried_detail").getJSONArray("queried_analyze").stream().filter(new Predicate<Object>() {
            @Override
            public boolean test(Object o) {
                String temp = ((JSONObject) o).getString("org_type");
                if (Objects.equals("其它", temp)) {
                    return true;
                }
                return false;
            }
        }).collect(Collectors.toList());

        if (collect.size() > 0) {
            String loan_cnt_15d = ((JSONObject) collect.get(0)).getString("loan_cnt_15d");
            String loan_cnt_30d = ((JSONObject) collect.get(0)).getString("loan_cnt_30d");
            String loan_cnt_90d = ((JSONObject) collect.get(0)).getString("loan_cnt_90d");
            System.out.println(loan_cnt_15d);
        }

        //Optional<Object> first = dataJson.getJSONArray("risk_device").stream().sorted(new Comparator<Object>() {
        //    @Override
        //    public int compare(Object o1, Object o2) {
        //        if (((JSONObject) o1).getInteger("loan_cnt") > ((JSONObject) o2).getInteger("loan_cnt")) {
        //            return -1;
        //        } else if (((JSONObject) o1).getInteger("loan_cnt") < ((JSONObject) o2).getInteger("loan_cnt")) {
        //            return 1;
        //        }
        //        return 0;
        //    }
        //}).findFirst();


        //System.out.println(first);
        System.out.println(collect);
        System.out.println(dataJson);
    }

}
