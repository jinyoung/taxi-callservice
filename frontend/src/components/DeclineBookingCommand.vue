<template>

    <v-card outlined>
        <v-card-title>
            DeclineBooking
        </v-card-title>

        <v-card-text>
            <String label="PickUpLocation" v-model="value.pickUpLocation" :editMode="editMode"/>
            <String label="DropOffLocation" v-model="value.dropOffLocation" :editMode="editMode"/>
            <String label="DriverId" v-model="value.driverId" :editMode="editMode"/>
            <String label="Reason" v-model="value.reason" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="declineBooking"
            >
                DeclineBooking
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
        name: 'DeclineBookingCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.pickUpLocation = '';
            this.value.dropOffLocation = '';
            this.value.driverId = '';
            this.value.reason = '';
        },
        watch: {
        },
        methods: {
            declineBooking() {
                this.$emit('declineBooking', this.value);
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

