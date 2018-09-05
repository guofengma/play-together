package com.cser.play.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("apply_list", "id", ApplyList.class);
		arp.addMapping("company_account", "id", CompanyAccount.class);
		arp.addMapping("company_info", "company_id", CompanyInfo.class);
		arp.addMapping("deal_record", "id", DealRecord.class);
		arp.addMapping("gift", "id", Gift.class);
		arp.addMapping("gift_comment", "id", GiftComment.class);
		arp.addMapping("gift_like", "id", GiftLike.class);
		arp.addMapping("notice", "id", Notice.class);
		arp.addMapping("order_list", "id", OrderList.class);
		arp.addMapping("orders", "id", Orders.class);
		arp.addMapping("pay_order", "id", PayOrder.class);
		arp.addMapping("product", "id", Product.class);
		arp.addMapping("reward_task", "task_id", RewardTask.class);
		arp.addMapping("reward_task_accept", "id", RewardTaskAccept.class);
		arp.addMapping("session", "id", Session.class);
		arp.addMapping("sign_in", "id", SignIn.class);
		arp.addMapping("sign_in_info", "user_id", SignInInfo.class);
		arp.addMapping("sign_supplement", "user_id", SignSupplement.class);
		arp.addMapping("sms_code", "id", SmsCode.class);
		arp.addMapping("suggest", "id", Suggest.class);
		arp.addMapping("user_account", "id", UserAccount.class);
		arp.addMapping("user_info", "user_id", UserInfo.class);
	}
}
