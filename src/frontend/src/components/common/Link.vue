<template>
    <div>
        <Layout>
    <v-app id="inspire">

            <v-divider></v-divider>

            <v-container class="pa-4 text-center">
                <v-row class="fill-height" align="center" justify="center">
                    <h2>Equipment</h2>
                    <template v-for="(item, i) in items">
                        <v-col
                                :key="i"
                                cols="12"
                                md="4"
                        >
                            <v-hover v-slot:default="{ hover }">
                                <v-card
                                        :elevation="hover ? 12 : 2"
                                        :class="{ 'on-hover': hover }"
                                        :href= item.link

                                >
                                    <v-img
                                            :src="item.img"
                                            height="225px"
                                    >
                                        <v-card-title class="title white--text">
                                            <v-row
                                                    class="fill-height flex-column"
                                                    justify="space-between"
                                            >{{ item.title }}
                                            </v-row>
                                        </v-card-title>
                                    </v-img>
                                </v-card>
                            </v-hover>
                        </v-col>
                    </template>
                </v-row>
            </v-container>

            <v-container class="pa-4 text-center">
                <v-row class="fill-height" align="center" justify="center">
                    <h2>Protein</h2>
                    <template v-for="(protein, i) in protein">
                        <v-col
                                :key="i"
                                cols="12"
                                md="4"
                        >
                            <v-hover v-slot:default="{ hover }">
                                <v-card
                                        :elevation="hover ? 12 : 2"
                                        :class="{ 'on-hover': hover }"
                                        :href= protein.link

                                >
                                    <v-img
                                            :src="protein.img"
                                            height="225px"
                                    >
                                        <v-card-title class="title white--text">
                                            <v-row
                                                    class="fill-height flex-column"
                                                    justify="space-between"
                                            >{{ protein.title }}
                                            </v-row>
                                        </v-card-title>
                                    </v-img>
                                </v-card>
                            </v-hover>
                        </v-col>
                    </template>
                </v-row>
            </v-container>
        </v-app>
        </Layout>
    </div>
</template>

<script>
    import {mapState} from "vuex";
    export default {
        name: "Link",
        data () {
            return {
                items: [
                    {title: 'IIIC',link:'https://www.dzmcfitness.com/?gclid=EAIaIQobChMIt7CwhNaM6gIVBzdgCh0mRQRZEAAYASAAEgJb4vD_BwE' ,img: 'https://lh3.googleusercontent.com/HArqI_ix2pZRIe--s-LaIAxPDmFP349r8zZ4DPzUcHEHaOVgWNRkkIusB4mMrHOSRVG_jg=s123'},
                    {title: 'technogym',link:'https://www.technogym.com/int/' ,img: 'https://www.technogym.com/skin/frontend/technogym/default/images/technogym.png'},

                    {title: 'cybexintl',link:'https://www.cybexintl.com/' ,img: 'data:image/png;base64,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'},
                    {title: 'bestgymequipment',link:'https://www.bestgymequipment.co.uk/' ,img: 'https://cdn.shopify.com/s/files/1/0052/6080/4167/files/Screenshot_2019-11-01_at_15.10.46_884x250.jpg?v=1572621059' },

                    {title: 'lifefitness',link:'https://lifefitness.com/' ,img: 'https://lifefitness.com/sites/all/themes/custom/fitnesslife/logo.png'},
                    {title: 'precor',link:'https://www.precor.com/en-us' ,img: 'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIAEwAlwMBIgACEQEDEQH/xAAbAAEBAQEBAQEBAAAAAAAAAAAABQYEAgMHAf/EADYQAAEEAgIBAQUGAgsAAAAAAAEAAgMEBREGEiExEyJBYYEHFDJxkdJRoRUWI0NFVXOTorHB/8QAGAEBAAMBAAAAAAAAAAAAAAAAAAECAwT/xAAfEQEAAgIBBQEAAAAAAAAAAAAAARECAxIEITEy8BP/2gAMAwEAAhEDEQA/AP0NERAREQEREBERAREQEREBERAREQEREBERAREQEReXOa3XY+qEzXl6RTbGexdaAzz3GMiDunbq4hx+Xjz9F8LfKcJSe2O1fbG9zQ7oYn9gD5GxrY+qtOMx5hTHZjl6ysoo9DlGEyNplWnfZJO/fRns3t7aG/GwF85+X8frzPhlyUfdhLXdWPcN/mAQVVe1xFLx3IcRkhMaV6OT2DO8mw5nVv8AH3gPC5DzTjgJH9JtP5QyftQX0UablOEgrV7EuQY2Kw0uiJjftwB1vrrevHqQlPlWDuyuirZBjnMjdI7bHtDWN9XEkAABBZRZ88144P8AE2/SGT9q7IeRYibHy5CO/EasTur5CCOp+A0Rv+SFqiLP/wBdeOf5kP8AZk/aqtTJUrghNWw2X2zDJGWg+80eD/0fHyQdaIiAiIgIiICm5mb2VSy/f4ICB8i7x/6qSlZulYuVHw1wCZZGhxcdBrR53+ulrprl3c3VcvynjFyw+Yh+85Dj+MA2HNa5w/1H+f8AiAubG3cc/kuazOZhE9KN7m9TCJAC5+mEg+PwsI+q0j8DkjyibJiFvsa0JFVvdu5XCPq0Ab8efPnS6Ps/49awVCwcg1rbFhzfca7t1a0eNkfHZK03ZxlVM+k0zripj6IZOnap2+VXsxi6zYqFCrJNGI4gxocI+o2B4BLif0X84fZwWJxbp87SbObExbCXVRLprA3et+nly3vLqly7x61TxsPtJpurevcN93sCfJIHoFIbxOSfgsOLnY1l+LtMw9geshJOtj4EHSwt10x+P3Fx3kWTEPso7T2VoQG6GnP25rfkBr0VXiVrHx0adK1xia5PLLo2302uaQ53g9iPwgEfoum9hOS3+I1MZNUaJ6lgaBnZ/aRBp6+d693etH4AKphZuX1PuNOxhaTaUQZE5zJQHNYNDf4z5A8+iFJFmGLLfae2tJFHJWrNDXRuaC3qxm9a9Ndj6KxzqKliuK220atas6y+OI+xiazt72yDoefDSpEGH5Ti+SX8pRx9Wy6d0oa6WVvXq54dsDsCD4C7OTY3kfIMDUZPQhitx2HOkhjmbojrprgS4j4nxtB4q4zH0fs6dcsUKj7T6j5BNJA1z+z99fJG/i1ZCyDX4dUiaNyXLskwA9SGNDB/MlanI1OZZDCtxEmJpxVg1je0crQdM1r+8P8AAfBLHEsmchga7YWOo0Y4/bStkbou9oXyaBOyPQeiImHBya9gI8O/EY+gxuSheyB8v3RrXbYdO971JJH12t3xjHihgsdFJC1liOuA/bR2aT7zhv8AMlQuUcfyI5BVzvH4mvsggzxl7WAkeN+deo90/kFsY3F0bXOYWEgEsJBLfl48KFoekRFCRERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREH/2Q=='},
                        ],
                protein :[
                    {title: 'optimumnutrition',link:'https://www.optimumnutrition.com/en-us' ,img: 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAgVBMVEX///8AAACnp6f09PS7u7tMTEz7+/swMDC2trYkJCTp6enHx8eNjY3k5OTs7OxfX1/Nzc3V1dWoqKhUVFRGRkbJycnd3d1sbGyvr6+UlJQ8PDzT09N0dHTBwcGampp9fX1kZGRAQEAoKCgXFxcdHR1ycnIPDw+fn58tLS18fHyFhYU3c6X0AAAI8ElEQVR4nO2caZeyOgyARRBRNgVFUMFlHBn5/z/wylYKkhQZGN97Tp6PQwaapkuSpk4mBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQxP8QVS5RP92UgbEOfvDt7m9SxW3vnmJ9+emWDcBSSWYSwtlp1dLbuO6swWazuXw35LTbnOO6KJD8P1AtRT9dMe0KLi3NcQHZTUMOELvnT52H4Y2oXrjroF3BtPG/B0hwX5dzALGsz5ZSsA5vxkjqLY3u6mUtr49VcGD/1D9zb5e6ZQ+voetuPGk1hn7e+T39UvjhBJpQ+qp9ZwpIaelDU5pcl3Hg7IbXb9lDvydW9YYNLFX7EiBzzR6upcl8Npso9uAKBr304xeRLSLFb6QxIKNkT2VpspB/JsehJ6K36KmgVE2YfTcNVUBkXjw3XH9iGpI8rILQ4taFY/EOHRPi2hsBImEpEEjuz35gp+KINe42m6EGLncCzITcbBWZMMVsMaBseWvPW/bzG7ElJjFTiRCRWOQvwUQkyWQfg+a73qWllrfVfCeKotgP16bVVV1siy8nGSJS2BCfyOvyYzIgcOnY2BxVNnU/eNj7+eZ8MqbKysSUheZFSumYrRGZfB4qqILVcgS5FH03eMvTHeN8eb5hMfsOfN2zXkSwxrM9KUGE8hVC4MluixcNY8JWVQ9a8Mh35P0umYYHNmW/kHaV/QGtDhmZhIYryBZKqKsOv9awbKq1VuKjm/uFe/sUa8EN+OaToPw3yM1KSYT9lKLlL4JMOBtKwQprrUXHyz2zgJoO5d3lVVUmjbU9WyV9gYKSk7/oBDxet7VxGFzbcFbF7qout8+YvnIu41IIM6GbSYhMWLzLQl8yCqUreXdPU71ccVVz+1ye9rdSCJ2FK1EX5OQDHvIsRox3f+pfWsySp6JNISxmzD0RoYJS5kdDJhw+jGAA0+dmJ/6q2ldMfXpygQUpWyPFJszXo2/g4YgmxNrUzFCoXhgdm77nVfiagtQtMIFn5/EUxLwZNgvlWeIfKoNaBz+pDJptAlC8x5NG7JB3+DItBgPanKq2pxSzcHNyVpXHr641w77l+wm6EJW4sAlHSFeUYK5YZUL+r3c38deVnrLFdQHOBo5gxjMhtLJlKFg32IbC+fLWYfq4iDScTzzgybG1cYMA+Rcp11IIHsmXx5SLU1VTMWzkhYsJ9HS8EwLUhCyjgI3kLEUoh1y4Ym2jc3uceINm4WM0BdHMBcsoiLvBSLfPaMuZU95Gr/ZaQLPwNZwbCqhPM1hG4SHqBjaK77v4wKm5DA30ZKfkNJqCaOqCnTKITVgfxfOTxq2MqjfdAfl7xsA5Q44l9tkyIEdH8h7qAjs6cEmTpXKawy9JRlMQNSHLYotHMjSKL4bOz8wwAbQcz4Ro21lSSDiS0VG8r2lpKafXIHKsI7Qn2NbVzYRZN6CZ5EzLoDZincZ3xysLgPyLDJYUEo5kaDLXo06bPxBXt5yjEby2bCgwE7KMgrgboC54yZ1+JXw61DOKWfkhE7KkkHAkg/Feq213CqeQl6b4otEUBOsJUgYwoQmpbivc0uPtxnNnsCx3lVEQjmQ43kM658w83qe/d962tG4IMBOypJC4G+BgATW/dMrnQebvfUVjGBJtO3O6hN0AqfEtGOBP5r5aBW+74bPBWNtZRgEuq5CKboBesxRr+CThPrAJ4cb2Af08MyEWGGRROTQSHsgznljn8nYLDWxuD7ADX2bCFda4bEGETGh10zCt7wq5YHmhQO19GzSoYM7HBRHKPBFoFGfBQgcNc6PxGemfoYqgsJiWJYWwypj8RAoqDrK6aVic/U9U3rO1B1lX0Rwp+wIS0eVZOGgU5/EeukxlVPOu9qYhvBwsP81MiJ3J52eZkAnlbhreuBap/Ize/z55imUV2Nux08BMCBrFRbwn1LC+PdTqT5rHJe+CrZHMncEq3PJxBBUHyd00nDdaVSvF+WWSH1tnSicRW23zHBVU31XGe+heIzVNOGksTftfBVVIWQI7tceqt/K1CFqIyqYJNNy/tqtm9dsvsjfYSlqGTVhMkbuQUH0XWwkFGrZFFLVqlVt/K6LbvS6r6tLHrFzkN6DiIPYZXMNmVXtOLdhssXJH0N1QSBE6QnsJK93AHQagvquetuufR8W2cgGbcnZAJXrVV9BKU6g4qO7o9j7a71BTAMAmGVTfxW1kqIZQfVf9oLV/hY3oHAFgU/ka0ETlPoJpCDa9kXvtfazYITh9ZcFtYFB9l9NRQzCib/S9A8kJwVeBNua10A0YBHdeBikXBouDmtUAvzizMd9bbXb1eYPe5+mgIbSCvAyNX51KdS/Md7Wme9HFhIiGkAlf6zliQLIjCua4FMyTlgQRVGNUz7PA0Vd7cOS1DKtfh1GyblzAdtzPgd7uG8YZ0zq+37inZ/pajtKgtR5/2VbuNlAxn6k7xre72V9vX1+36/zi2o/A0b0/vQrrtZfzjZfx74PVOxco+0AgM2LN8Pvods8ON6dgbnrMG6RvYqaLYI+UtRWe4CBm98/cGJedbLF6t6rJ84/YlrwY60DqXWStGGM/YtkS1dMS5BZmytdf3eYWoHIbajcX2QzjHXq57V/Sz/L5FUI0Ca21Fuy6Xd90O11fGxszrg8zuCLGXPnGed85WrsH/8APNah60swVv7gequWFvrETzLYX9U6j3E1/D69t92KpXdlbKXHrzSIxt2Swa129WWrf7aNN06bG0b4I7wTB2NPxyrw7YimPPobpwiz6uPFM/9jlJ0B68LWbrj/suciruEMM2YdFvWb6I3j+Q7w59+Hy4G+lfITUrbqMoNrVTZzVp0M++eCMYLmfc+Lo6E3yP9HN0wy7Z6a4nfvePUb+1vv0dEvt5mf3s4ZRa+5+J5Gvrzv/0sHIbF8vE77HdT+zdw8jcrTwYC4/by4QVbZMb31Y6aGi+c40jqIgMOoEQRTHU9/XQn11WHtPdf4RKxEEQRAEQRAEQRAEQRAEQRAEQRAEQRAEQRAEQRAEQRAEQRAEQRAEQRAEQRD/W/4DF2CBrIGDCaEAAAAASUVORK5CYII='},
                    {title: 'gardenoflife',link:'https://www.gardenoflife.com/content/' ,img: 'https://www.gardenoflife.com/content/wp-content/themes/gardenoflife/assets/images/logo.png'},

                    {title: 'nkdnutrition',link:'https://nkdnutrition.com/' ,img: 'data:image/jpeg;base64,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' },

                    {title: 'rspnutrition',link:'https://rspnutrition.com/' ,img: 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAdVBMVEX///8AAABKSkr19fVra2vY2Njh4eHr6+skJCSzs7OamprS0tK8vLyGhob4+Pj8/PxFRUWmpqZfX1/w8PBZWVk+Pj6NjY16enrIyMh+fn5lZWWUlJQ5OTk0NDTd3d0vLy8oKCggICBycnKtra0ODg5TU1MVFRWnkzG9AAADiUlEQVR4nO3a6ZKiMBiFYVRaBTdEXHFf+v4vcdCxHP0CdBKibTnv89PKdhRCEvQ8AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADwYfpNXa3RQKe9xjMMdLou8FUzsUp6wTqvmUFnOE/GO6PGzLSjeNJtPT3hxXEuQ7am7hPl2wyNf02LhJl4dN9G6DhGueFLEtZqX7cWBienAX62zb1PnCes3W6JyOXo9cxeknB8baDncui6TGYc64S17qV+0+G49dVfkjC61N87HLeB5isSXi6VgbtBGwlfkjDIqnfcDdqIwWVaIeE8qz50N2gzL0l4/h5zFjPb08J3rK72oj+byoSdAt30KDvZZdUT+WHQ0P929fXnsh/9R6JMWFI0lr1kS8Sx+GhUUr8SGTHQrikTlixslXmz73nbx09ODrLk64u+9SdTg4TKs6+hJEyqRymyeexpol3RJKHcQ6gJd9WTFFm9IqF8NGRX6VJ8ZLq10Sd+w6l2xSoJs7LKzmkxs9mH/0xOAnvtmiYJ08eiba9gWbpZbVZRFNVPp5PvL/bz+XSSScNwGMyalicuXdHHc37DxWPRuhpaxzI128FeNGQrT7kP5YXS89SvVs/49rxuaflSz0nsE5YUlSu08waxZZXw30WmLJR06U9pMmHRaWknUE4rLuszOZnquj4525bVr/tvm4T6/Ev9g231SbWE9itv4z6+K9W3TfitHdA+YVC1gWmVhPoTjfUAD7cWZpYtXKZt24QGexi7hMn9SVDD8kx/Zp8w1Q9olfBbTmSNwLcYamqdcJyXxO1vGHWUhhrrWTAchmHa6033e9+PT8l4vGrvjoWPvNg24dHoHMH2PjS41bPV0KjZnexkEyvLhFuzgwTrqXBu1M2ZsvSyS2hyD1ZKWFMv1J/IVVHfPGFyMD7psk8YGyeUG5GGkrAXlOh2DM7yXSQs3WjlkjvolpJQf7VpnzDMl+7VJbbxZZpzkvULCYtLNmXGQ3HZXCP5Fan34SsSllx6sqjRA8NrdXcyofduCe23q/lynoe/nVA51q9m8X4Jldcj1YTvl9DxnxLWn57wfBt+dsLZpyf8e5D1ZgldzjTXvxq8WUKH/53xvbdMKN5b2Dve3lF/ZsLFXY7d8xOul/V7y9KZJqpXEMf7XnoQrxeThyJjoz8dAgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACA/8Efpd87j4HF1dYAAAAASUVORK5CYII='},
                     ]
            }
        },
        computed: {
            ...mapState({
                gym: state => state.gym.gyms
            })
        },
    }
</script>

<style scoped>
    .v-card {
        transition: opacity .4s ease-in-out;
    }
    .v-card:not(.on-hover) {
        opacity: 0.6;
    }
</style>