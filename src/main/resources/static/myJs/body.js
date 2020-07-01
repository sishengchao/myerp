/**
 项目JS主入口
 以依赖layui的layer和form模块为例
 **/
layui.define('element', function(exports){
    var $ = layui.jquery,
        element = layui.element;
    //触发事件
    element.on('tab(demo)', function(data){
    });
    var active = {
        tabAdd: function(options){
            var update = true;
            $('.layui-tab-title li').each(function () {
                if(options.data('id') == this.getAttribute('lay-id')){
                    update=false;
                }
            });
            if(update){
                //新增一个Tab项
                element.tabAdd('demo', {
                    title: options.data('title') //用于演示
                    ,content: '<iframe class="layui-side-scroll" name="'+options.data('iframeId')+'"  id="'+options.data('iframeId')+'"  style="padding: 0;width: 100%;height: 500px;margin: 0;border: 0;vertical-align: top;"\n' +
                        '                src="'+options.data('url')+'"></iframe>'
                    ,id: options.data('id') //实际使用一般是规定好的id，这里以时间戳模拟下
                });
            }
            element.tabChange('demo',options.data('id'));
        }
        ,tabDelete: function(othis){
            //删除指定Tab项
            element.tabDelete('demo', '44'); //删除：“商品管理”


            othis.addClass('layui-btn-disabled');
        }
        ,tabChange: function(){
            //切换到指定Tab项
            element.tabChange('demo', '22'); //切换到：用户管理
        }
    };

    exports('body',active); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});



