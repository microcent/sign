package cn.com.codeele.sign.data.local.db;

import javax.inject.Inject;

import cn.com.codeele.sign.app.Constant;
import cn.com.codeele.sign.app.SignApplication;
import cn.com.codeele.sign.data.local.db.gen.DaoMaster;
import cn.com.codeele.sign.data.local.db.gen.DaoSession;

/**
 * Created by Administrator on 2017/12/20.
 */

public class DaoManager {

    private DbUpgradeHelper helper;

    @Inject
    public DaoManager(SignApplication context) {
        helper = new DbUpgradeHelper(context.getApplicationContext(), Constant.DB_NAME);
    }

    /**
     * 获取操作数据库的Session
     */
    public DaoSession getDaoSession() {
        //该数据库连接属于 DaoMaster，所以多个 Session 指的是相同的数据库连接。
        DaoMaster mDaoMaster = new DaoMaster(helper.getWritableDatabase());
        return mDaoMaster.newSession();
    }

}
