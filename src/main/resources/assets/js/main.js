$(".order-addItem-toggler").click(function() {
    if ($(".order-addItem").hasClass("active")) {
        $(".order-addItem").removeClass("active");
        $(".order-addItem").css("top", 65);
    } else {
        var scrollTop = $(window).scrollTop();

        $(".order-addItem").addClass("active");
        $(".order-addItem").css("top", scrollTop + 65);
    }
});

//TODO: dokończenie togglera żeby działał

function toggleOrderNewItemMenus(menuType) {
    var menuTypeUp = function() {
        return menuType.charAt(0).toUpperCase() + menuType.slice(1);
    };
    $(document).on("click", ".order-newItem-" + menuType, function() {
        var state = $(this).data('state-' + menuType);
        var switchOn = function() {
            $(".order-newItem-" + menuType + "-text").hide();
            $(".order-newItem-" + menuType + " > input").show();
            $(".order-choose" + menuTypeUp()).show();
        };
        var switchOff = function() {
            $(".order-newItem-" + menuType + "-text").show();
            $(".order-newItem-" + menuType + " > input").hide();
            $(".order-choose" + menuTypeUp()).hide();
        };

        switch (state) {
            case 1:
            case undefined:
                switchOn();
                $(this).data('state-' + menuType, 2);
                break;
            case 2:
                switchOff();
                $(this).data('state-' + menuType, 1);
                break;
        }
    });
}
toggleOrderNewItemMenus("comp");
toggleOrderNewItemMenus("dish");
