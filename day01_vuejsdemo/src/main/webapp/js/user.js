new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            age:"",
            email:"",
            sex:""
        },
        userList:[]
    },
    methods:{
        findAll:function () {
            //在当前方法中定义一个变量，表明时vue对象
            var _this=this;
            axios.get('user/findAll.do')
                .then(function (response) {//成功
                    _this.userList=response.data;//响应数据给userList赋值
                })
                .catch(function (error) {//失败

                })
        },
        findById:function (userid) {
            //在当前方法中定义一个变量，表明时vue对象
            var _this=this;
            axios.get('user/findById.do',{params:{id:userid}})
                .then(function (response) {//成功
                    _this.user=response.data;
                    $("#myModal").modal("show");
                })
                .catch(function (error) {//失败

                })
        },
        update:function (user) {
            var _this=this;
            axios.post('user/updateUser.do',_this.user)
                .then(function (response) {
                    _this.findAll();
                })
                .catch(function (error) {

                })
        }
    },
    created:function () {//当页面加载时触发请求，查询所有
        this.findAll();
    }
});