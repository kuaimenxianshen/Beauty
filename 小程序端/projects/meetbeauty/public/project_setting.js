module.exports = { // meetbeauty
    PROJECT_COLOR: '#7725DC',
    NAV_COLOR: '#ffffff',
    NAV_BG: '#7725DC',

    // setup
    SETUP_CONTENT_ITEMS: [
        { title: '关于我们', key: 'SETUP_CONTENT_ABOUT' },
        { title: '用户注册使用协议', key: 'SETUP_YS' }
    ],

    // 用户 
    USER_FIELDS: [
        { mark: 'sex', title: '性别', type: 'select', selectOptions: ['男', '女'], must: true },
        { mark: 'birth', type: 'date', title: '出生年月', must: true },
        { mark: 'xueli', title: '学历', type: 'select', selectOptions: ['专科', '本科', '硕士研究生', '博士研究生', '其他'], must: true }
    ],


    NEWS_NAME: '资讯',
    NEWS_CATE: [
        { id: 1, title: '小店动态' },
        { id: 2, title: '美容小课堂' },
        { id: 3, title: '健康常识' },
        { id: 4, title: '资质荣誉' },
    ],
    NEWS_FIELDS: [
        { mark: 'desc', type: 'textarea', title: '简介', must: true, min: 2, max: 200 },
        { mark: 'content', title: '详细内容', type: 'content', must: true },
        { mark: 'cover', type: 'image', title: '封面图', must: true, min: 1, max: 1 },
    ],


    MEET_NAME: '预约',
    MEET_CATE: [
        { id: 1, title: '美容师预约', desc: '专业人士，在线预约' },
        { id: 2, title: '皮肤护理', desc: '焕颜美肌，细致呵护' },
        { id: 3, title: '身体管理', desc: '纤体塑形，舒缓放松' },
        { id: 4, title: '光电仪器', desc: '科技美肤，精准焕新' },
        { id: 5, title: '美甲美睫', desc: '指尖眉眼，精致出彩' },
        { id: 6, title: '养生抗衰', desc: '内调外养，逆龄时光' },
    ],
    MEET_FIELDS: [
        { mark: 'cover', title: '封面图', type: 'image', min: 1, max: 1, must: true },
        {
            mark: 'time', title: '预约时段设置', type: 'rows', ext: { titleName: '时段', maxCnt: 15, minCnt: 1 },
            def: [{ title: '9点~12点' }, { title: '14点~18点' }],
            must: false
        },
        { mark: 'desc', title: '预约须知', type: 'content', must: true },
    ],
    MEET_JOIN_FIELDS: [
        { mark: 'name', type: 'text', title: '姓名', must: true, max: 30 },
        { mark: 'phone', type: 'mobile', title: '手机', must: true, edit: false }
    ],


}