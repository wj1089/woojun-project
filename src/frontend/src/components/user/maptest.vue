<template>
    <div>
        <h1>hello</h1>
        <div id = map>

        </div>
    </div>
</template>


<script>
    export default {
        mounted() {
            const script = document.createElement('script');
            /* global kakao */
            script.onload = () => kakao.maps.load(this.initMap);
            script.src = 'http://dapi.kakao.com/v2/maps/sdk.js?autoload=false&appkey=b656a3c0e3839e3cf181b231bcde13bd';
            document.head.appendChild(script);
        },
        methods: {
            initMap() {
                var container = document.getElementById('map');
                var options = {center: new kakao.maps.LatLng(33.450701, 126.570667), level: 3};
                var map = new kakao.maps.Map(container, options);
                //마커추가하려면 객체를 아래와 같이 하나 만든다.
                var marker = new kakao.maps.Marker({position: map.getCenter()});
                marker.setMap(map);
            }
        }
    }


</script>

<style scoped lang="scss">

    #map {
        width: 500px;
        height: 500px;
    }
</style>
