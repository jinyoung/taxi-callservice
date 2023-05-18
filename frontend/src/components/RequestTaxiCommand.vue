<template>

    <v-card outlined>
        <v-card-title>
            RequestTaxi
        </v-card-title>

        <v-card-text>
            <String label="PickUpLocation" v-model="value.pickUpLocation" :editMode="editMode"/>
            <String label="DropOffLocation" v-model="value.dropOffLocation" :editMode="editMode"/>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="requestTaxi"
            >
                RequestTaxi
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'RequestTaxiCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.pickUpLocation = '';
            this.value.dropOffLocation = '';
            this.value.userId = '';
        },
        watch: {
        },
        methods: {
            requestTaxi() {
                this.$emit('requestTaxi', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

