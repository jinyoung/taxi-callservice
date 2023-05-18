<template>

    <v-card outlined>
        <v-card-title>
            LeaveFeedback
        </v-card-title>

        <v-card-text>
            <String label="BookingId" v-model="value.bookingId" :editMode="editMode"/>
            <Number label="Rating" v-model="value.rating" :editMode="editMode"/>
            <String label="Comment" v-model="value.comment" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="leaveFeedback"
            >
                LeaveFeedback
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
        name: 'LeaveFeedbackCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.bookingId = '';
            this.value.rating = 0;
            this.value.comment = '';
        },
        watch: {
        },
        methods: {
            leaveFeedback() {
                this.$emit('leaveFeedback', this.value);
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

