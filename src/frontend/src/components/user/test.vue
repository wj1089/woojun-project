<template>
    <div>
        <layout>
            <v-app id="inspire">
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
        </layout>
    </div>
</template>